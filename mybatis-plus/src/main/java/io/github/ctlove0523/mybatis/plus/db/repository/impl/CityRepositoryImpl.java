package io.github.ctlove0523.mybatis.plus.db.repository.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.ctlove0523.mybatis.plus.db.entity.City;
import io.github.ctlove0523.mybatis.plus.db.mapper.CityMapper;
import io.github.ctlove0523.mybatis.plus.db.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityRepositoryImpl extends ServiceImpl<CityMapper, City> implements CityRepository {
    @Override
    public List<City> listByCountyId(int countyId) {
        Wrapper<City> queryWrapper = Wrappers.lambdaQuery(City.class)
                .eq(City::getCountryId, countyId);
        return list(queryWrapper);
    }
}
