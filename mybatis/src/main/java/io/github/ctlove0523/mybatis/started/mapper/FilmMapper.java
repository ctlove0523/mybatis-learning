package io.github.ctlove0523.mybatis.started.mapper;

import io.github.ctlove0523.mybatis.started.entity.Film;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ctlove0523
 * @since 2022-07-05
 */
public interface FilmMapper {

    Film selectFilmById(Integer filmId);
}
