package io.github.ctlove0523.mybatis.started.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class City {
    private Integer cityId;
    private String city;
    private Integer countryId;
    private LocalDateTime lastUpdate;
}
