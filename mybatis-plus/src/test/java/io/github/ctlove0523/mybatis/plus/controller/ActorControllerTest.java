package io.github.ctlove0523.mybatis.plus.controller;

import io.github.ctlove0523.mybatis.plus.db.entity.Actor;
import io.github.ctlove0523.mybatis.plus.util.BaseTest;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

public class ActorControllerTest extends BaseTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.openMocks(this);
        this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    public ResultActions queryActor(int id) throws Exception {
        String url = "/v1/actors/" + id;
        return mockMvc.perform(MockMvcRequestBuilders.get(url));
    }

    @Test
    public void testQueryActor() throws Exception {
        Integer actorId = 1;
        Actor actor = new Actor();
        actor.setActorId(actorId);
        actor.setFirstName("firstName");
        actor.setLastName("lastName");
        actor.setLastUpdate(LocalDateTime.now());
        actorRepository.save(actor);

    }

}
