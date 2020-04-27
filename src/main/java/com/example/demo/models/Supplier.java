package com.example.demo.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Supplier {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
}
