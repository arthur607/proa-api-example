package br.com.example.proa.apiproa.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class LoginRequest {

    private String password;

    private String email;

    public LoginRequest() {
    }
}
