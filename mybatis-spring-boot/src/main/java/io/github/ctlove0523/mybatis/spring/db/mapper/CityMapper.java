package io.github.ctlove0523.mybatis.spring.db.mapper;

import io.github.ctlove0523.mybatis.spring.db.entity.City;
import org.apache.ibatis.annotations.Mapper;
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
@Mapper
public interface CityMapper {

    City selectById(@Param("cityId") Integer cityId);

    List<City> selectNames(List<String> names);

    List<City> selectCityByRowBounds();

    Boolean existsById(@Param("cityId") Integer cityId);

    Boolean existsByCity(@Param(("city")) String city);
}
