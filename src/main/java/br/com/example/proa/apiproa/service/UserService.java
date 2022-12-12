package br.com.example.proa.apiproa.service;

import br.com.example.proa.apiproa.models.LoginRequest;
import br.com.example.proa.apiproa.models.RegisterRequest;
import br.com.example.proa.apiproa.models.UserEntity;
import br.com.example.proa.apiproa.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void process(RegisterRequest requestForm){
        var user = new UserEntity(UUID.randomUUID().toString(),
                requestForm.getNome(), requestForm.getEmail(), requestForm.getPassword());

        repository.save(user);
    }

    public UserEntity login(LoginRequest request) {

        final var user = repository.getUser(request.getEmail());

        if (user.isPresent()){
            System.out.println("Usuário com email: " + request.getEmail()+ " encontrado.");


            if (request.getPassword().equals(user.get().getPassword())) {
                return user.get();
            }else {
                throw new RuntimeException("senhas não bateram"); //error
            }

        }
        System.out.println("Usuário com email: "+ request.getEmail()+ " não encontrado.");
        return null;
    }
}
