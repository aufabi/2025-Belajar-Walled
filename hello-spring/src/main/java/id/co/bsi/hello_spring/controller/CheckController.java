package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.response.BalanceResponse;
import id.co.bsi.hello_spring.dto.response.HistoryResponse;
import id.co.bsi.hello_spring.dto.response.ProfileResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

    @GetMapping("api/balance")
    public ResponseEntity<BalanceResponse> getBalance (){
        BalanceResponse balanceResponse = new BalanceResponse();
        balanceResponse.setAmount(100000000);

        return ResponseEntity.ok(balanceResponse);
    }

    @GetMapping("api/profile")
    public ResponseEntity<ProfileResponse> getProfile (){
        ProfileResponse profileResponse = new ProfileResponse();
        profileResponse.setId(563421);
        profileResponse.setUsername("John Doe");
        profileResponse.setEmail("john.doe@rocketmail.com");
        profileResponse.setAccountType("Wadiah");

        return ResponseEntity.ok(profileResponse);
    }
    
    @GetMapping("api/history")
    public ResponseEntity<HistoryResponse> getHistory (){
        HistoryResponse historyResponse = new HistoryResponse();
        historyResponse.setDate("16/04/2025");
        historyResponse.setType("Transfer");
        historyResponse.setFromto("Ikbal");
        historyResponse.setDescription("Bayar hutang");
        historyResponse.setAmount("Rp 1.500.000");

        return ResponseEntity.ok(historyResponse);
    }
}
