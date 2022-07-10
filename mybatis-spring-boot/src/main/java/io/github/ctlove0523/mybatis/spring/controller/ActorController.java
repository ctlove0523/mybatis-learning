package io.github.ctlove0523.mybatis.spring.controller;

import io.github.ctlove0523.mybatis.spring.db.entity.Actor;
import io.github.ctlove0523.mybatis.spring.db.mapper.ActorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ActorController {

    @Autowired
    private ActorMapper actorMapper;


    @RequestMapping(value = "/api/v1/actor/{id}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Actor> showActor(@PathVariable("id") Integer id) {
        Actor actor = actorMapper.selectActor(id);
        return ResponseEntity.ok(actor);
    }

    @RequestMapping(value = "/api/v1/actors", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Actor>> listActors() {
        List<Actor> actors = actorMapper.selectAll();
        return ResponseEntity.ok(actors);
    }
}
