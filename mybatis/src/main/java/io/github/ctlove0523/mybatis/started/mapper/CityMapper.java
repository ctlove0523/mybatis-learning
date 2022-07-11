package io.github.ctlove0523.mybatis.started.mapper;

import io.github.ctlove0523.mybatis.started.entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ctlove0523
 * @since 2022-07-05
 */
public interface CityMapper  {

    City selectById(@Param("cityId") Integer cityId);

    List<City> selectNames(List<String> names);

    List<City> selectCityByRowBounds();
}
