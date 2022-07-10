package io.github.ctlove0523.mybatis.started.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ctlove0523
 * @since 2022-07-05
 */
@Getter
@Setter
public class Address {

    private Integer addressId;

    private String address;

    private String address2;

    private String district;

    private Integer cityId;

    private String postalCode;

    private String phone;

    private String location;

    private LocalDateTime lastUpdate;

}
