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
public class FilmCategory {

    private Integer filmId;

    private Integer categoryId;

    private LocalDateTime lastUpdate;

}
