package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.request.LoginRequest;
import id.co.bsi.hello_spring.dto.request.LogoutRequest;
import id.co.bsi.hello_spring.dto.request.RegisterRequest;
import id.co.bsi.hello_spring.dto.response.LoginResponse;
import id.co.bsi.hello_spring.dto.response.LogoutResponse;
import id.co.bsi.hello_spring.dto.response.RegisterResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/api/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setStatus("You are logged in");
        loginResponse.setToken("wfweoi3hoihewihfero");

        return ResponseEntity.ok(loginResponse);
    }

    @PostMapping("/api/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) {
        RegisterResponse registerResponse = new RegisterResponse();
        registerResponse.setStatus("Account has been registered");
        registerResponse.setToken("wfweoi3hoihewihfero");

        return ResponseEntity.ok(registerResponse);
    }

    @PostMapping("api/logout")
    public ResponseEntity<LogoutResponse> logout(@RequestBody LogoutRequest logoutRequest) {
        LogoutResponse logoutResponse = new LogoutResponse();
        logoutResponse.setStatus("You are now logged out");

        return ResponseEntity.ok(logoutResponse);
    }
}
