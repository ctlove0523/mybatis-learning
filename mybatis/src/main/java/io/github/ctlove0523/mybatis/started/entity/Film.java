package io.github.ctlove0523.mybatis.started.entity;

import io.github.ctlove0523.mybatis.started.handlers.FileRating;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;

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
public class Film {

    private Integer filmId;

    private String title;

    private String description;

    private Year releaseYear;

    private Integer languageId;

    private Integer originalLanguageId;

    private Integer rentalDuration;

    private BigDecimal rentalRate;

    private Integer length;

    private BigDecimal replacementCost;

    private FileRating rating;

    private List<String> specialFeatures;

    private LocalDateTime lastUpdate;

}
