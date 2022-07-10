package io.github.ctlove0523.mybatis.started.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author ctlove0523
 * @since 2022-07-05
 */
@Getter
@Setter
public class FilmList {

    private Integer fid;

    private String title;

    private String description;

    private String category;

    private BigDecimal price;

    private Integer length;

    private String rating;

    private String actors;

}
