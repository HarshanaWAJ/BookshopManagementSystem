package com.example.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private long id;
    private String first_name;
    private String last_name;
    private String user_name;
    private String email_id;
    private String user_address;
}
