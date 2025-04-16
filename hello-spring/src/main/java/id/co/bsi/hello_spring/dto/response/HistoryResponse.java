package id.co.bsi.hello_spring.dto.response;

import lombok.Data;

@Data
public class HistoryResponse {
    private String date;
    private String type;
    private String fromto;
    private String description;
    private String amount;
}
