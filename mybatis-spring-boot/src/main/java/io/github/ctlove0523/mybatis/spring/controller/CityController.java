package io.github.ctlove0523.mybatis.spring.controller;

import io.github.ctlove0523.mybatis.spring.db.entity.City;
import io.github.ctlove0523.mybatis.spring.db.mapper.CityMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CityController {
    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public ResponseEntity<City> selectCity(@PathVariable(name = "id") int id) {
        City city = cityMapper.selectById(id);
        return ResponseEntity.ok(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public ResponseEntity<List<City>> pageSelectCity(@RequestParam(name = "offset") int offset,
                                                     @RequestParam(name = "limit") int limit) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        List<City> cities = sqlSession.selectList("selectCityByRowBounds", null, rowBounds);
        return ResponseEntity.ok(cities);
    }

    @RequestMapping(value = "/api/city/exists/{id}", method = RequestMethod.GET)
    public ResponseEntity<Boolean> exists(@PathVariable(name = "id") int id) {
        return ResponseEntity.ok(cityMapper.existsById(id));
    }
}
