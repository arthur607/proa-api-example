package br.com.example.proa.apiproa.models;


import lombok.ToString;

/**
 * classe responsavel por mapear os campos do form de cadastro
 */
@ToString
public class RegisterRequest {

    private String nome;

    private String password;
    private String matchingPassword;

    private String email;

    public RegisterRequest() {
    }

    public RegisterRequest(String nome, String password, String matchingPassword, String email) {
        this.nome = nome;
        this.password = password;
        this.matchingPassword = matchingPassword;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public String getEmail() {
        return email;
    }
}
