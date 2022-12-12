package br.com.example.proa.apiproa.controller;

import br.com.example.proa.apiproa.models.LoginRequest;
import br.com.example.proa.apiproa.models.RegisterRequest;
import br.com.example.proa.apiproa.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@AllArgsConstructor
public class UserController {

    private final UserService service;


    @PostMapping("/signup")
    public ResponseEntity<Object> signup(@RequestBody RegisterRequest registerRequest) {
        service.process(registerRequest);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody LoginRequest request){

        var user = service.login(request);

        if (user == null){
            return ResponseEntity.notFound().build(); //404, validar no front
        }
        return ResponseEntity.ok().build(); //200

    }
}
