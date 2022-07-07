package io.github.ctlove0523.mybatis.started.mapper;

import io.github.ctlove0523.mybatis.started.entity.City;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ctlove0523
 * @since 2022-07-05
 */
public interface CityMapper extends BaseMapper<City> {

    List<City> selectNames(List<String> names);
}
