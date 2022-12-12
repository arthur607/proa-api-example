package br.com.example.proa.apiproa.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UserEntity {

    private final String id;
    private final String name;
    @EqualsAndHashCode.Include
    private String email;

    private final String password;

    //private tel, cpf, etc


    public UserEntity(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
