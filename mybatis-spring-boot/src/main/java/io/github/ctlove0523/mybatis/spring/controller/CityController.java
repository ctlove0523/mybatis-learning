package io.github.ctlove0523.mybatis.spring.controller;

import io.github.ctlove0523.mybatis.spring.db.entity.City;
import io.github.ctlove0523.mybatis.spring.db.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CityController {

    @Autowired
    private CityMapper cityMapper;

    @RequestMapping(value = "/api/city/{id}",method = RequestMethod.GET)
    public ResponseEntity<City> selectCity(@PathVariable(name = "id") int id) {
        City city = cityMapper.selectById(id);
        return ResponseEntity.ok(city);
    }
}
