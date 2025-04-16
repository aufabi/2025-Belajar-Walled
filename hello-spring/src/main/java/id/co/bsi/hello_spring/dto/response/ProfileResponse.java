package id.co.bsi.hello_spring.dto.response;

import lombok.Data;

@Data
public class ProfileResponse {
    private int id;
    private String username;
    private String email;
    private String accountType;
}
