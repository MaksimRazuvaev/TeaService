package com.example.demo.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Long discountId;
    private Long loginId;
}
