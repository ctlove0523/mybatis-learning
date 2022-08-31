package io.github.ctlove0523.mybatis.plus.controller;

import io.github.ctlove0523.mybatis.plus.db.entity.City;
import io.github.ctlove0523.mybatis.plus.db.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @RequestMapping(value = "/v1/city", method = RequestMethod.GET)
    public ResponseEntity<List<City>> listCity(@RequestParam(value = "country_id") int countryId) {
        return ResponseEntity.ok(cityRepository.listByCountyId(countryId));

    }
}
