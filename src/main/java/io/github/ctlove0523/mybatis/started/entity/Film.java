package io.github.ctlove0523.mybatis.started.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import lombok.Getter;
import lombok.Setter;

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
@TableName("film")
public class Film {

    @TableId(value = "film_id", type = IdType.AUTO)
    private Integer filmId;

    @TableField("title")
    private String title;

    @TableField("description")
    private String description;

    @TableField("release_year")
    private Year releaseYear;

    @TableField("language_id")
    private Integer languageId;

    @TableField("original_language_id")
    private Integer originalLanguageId;

    @TableField("rental_duration")
    private Integer rentalDuration;

    @TableField("rental_rate")
    private BigDecimal rentalRate;

    @TableField("length")
    private Integer length;

    @TableField("replacement_cost")
    private BigDecimal replacementCost;

    @TableField("rating")
    private String rating;

    @TableField("special_features")
    private String specialFeatures;

    @TableField("last_update")
    private LocalDateTime lastUpdate;


}
