package com.example.demo.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Discount {
    private Long id;
    private int discountNumber;
    private int numberOfOrders;
    private int customerId;
}
