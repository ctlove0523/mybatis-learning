package io.github.ctlove0523.mybatis.started.mapper;

import io.github.ctlove0523.mybatis.started.model.Country;

public interface CountryMapper {

    Country selectCountry(Integer countryId);
}
