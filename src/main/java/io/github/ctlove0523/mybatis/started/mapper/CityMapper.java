package io.github.ctlove0523.mybatis.started.mapper;

import io.github.ctlove0523.mybatis.started.model.City;

public interface CityMapper {

    City selectCity(Integer cityId);
}
