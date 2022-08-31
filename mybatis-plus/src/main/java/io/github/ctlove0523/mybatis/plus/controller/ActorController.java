package io.github.ctlove0523.mybatis.plus.controller;

import io.github.ctlove0523.mybatis.plus.db.entity.Actor;
import io.github.ctlove0523.mybatis.plus.db.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ActorController {
    @Autowired
    private ActorRepository actorRepository;

    @RequestMapping(value = "/v1/actors", method = RequestMethod.GET)
    public ResponseEntity<List<Actor>> listActor(@RequestParam(value = "first_name", required = false) String firstName,
                                                 @RequestParam(value = "last_name", required = false) String lastName) {

        return ResponseEntity.ok(actorRepository.listActor(firstName, lastName));
    }

    @RequestMapping(value = "/v1/actors/{id}", method = RequestMethod.GET)
    public ResponseEntity<Actor> showActor(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(actorRepository.getById(id));
    }
}
