package io.github.ctlove0523.mybatis.started.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Country {
    private Integer countryId;
    private String country;
    private LocalDateTime lastUpdate;
}
