package io.github.ctlove0523.mybatis.started.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Address {
    private Integer address_id;
    private String address;
    private String address2;
    private String district;
    private Integer cityId;
    private String postalCode;
    private String phone;
    private Object location;
    private LocalDateTime lastUpdate;
}
