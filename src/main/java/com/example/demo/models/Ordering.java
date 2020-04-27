package com.example.demo.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter
@Setter
@Builder
@ToString
public class Ordering {
    private Long id;
    private Date date;
    private int customerId;
}
