package io.github.ctlove0523.mybatis.started.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
public class Film {
    private Integer film_id;
    private String title;
    private String description;
    private Integer release_year;
    private Integer language_id;
    private Integer original_language_id;
    private Integer rental_duration;
    private Double rental_rate;
    private Integer length;
    private Double replacement_cost;
    private FileRating rating;
    private Set<String> special_features;
    private LocalDateTime lastUpdate;

}
