package io.github.ctlove0523.mybatis.started.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Customer {
    private Integer customer_id;
    private Integer store_id;
    private String first_name;
    private String last_name;
    private String email;
    private Integer address_id;
    private Boolean active;
    private LocalDate create_date;
    private LocalDateTime last_update;
}
