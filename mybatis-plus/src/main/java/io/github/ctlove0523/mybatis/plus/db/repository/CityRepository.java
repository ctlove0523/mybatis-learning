package io.github.ctlove0523.mybatis.plus.db.repository;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.ctlove0523.mybatis.plus.db.entity.City;

import java.util.List;

public interface CityRepository extends IService<City> {

    List<City> listByCountyId(int countyId);
}
