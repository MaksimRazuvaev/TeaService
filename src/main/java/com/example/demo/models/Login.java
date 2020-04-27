package com.example.demo.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Login {
    private Long id;
    private String userName;
    private String Password;
}
