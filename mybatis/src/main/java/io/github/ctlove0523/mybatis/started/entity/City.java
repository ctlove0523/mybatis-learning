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
public class City {

    private Integer cityId;

    private String city;

    private Integer countryId;

    private LocalDateTime lastUpdate;

}
