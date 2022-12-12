package br.com.example.proa.apiproa.repository;

import br.com.example.proa.apiproa.models.UserEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Optional;

/**
 * essa classe não é um repositório real (realizando buscas no banco e etc), apenas uma
 * representação em memória de como funcionaria um database(mysql por ex)
 */
@Component
public class UserRepository {

    private static final HashMap<String, UserEntity> fakeDatabase = new HashMap<>();

    public void save(final UserEntity user){
        System.out.println("Usuário: "+ user + " salvo no db.");

        fakeDatabase.put(user.getEmail(), user);
    }

    public Optional<UserEntity> getUser(String email){  //usar email como id do db

        return Optional.ofNullable(fakeDatabase.get(email));
    }
}
