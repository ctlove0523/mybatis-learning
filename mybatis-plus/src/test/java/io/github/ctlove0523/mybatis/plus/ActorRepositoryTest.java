package io.github.ctlove0523.mybatis.plus;


import io.github.ctlove0523.mybatis.plus.db.entity.Actor;
import io.github.ctlove0523.mybatis.plus.db.repository.ActorRepository;
import io.github.ctlove0523.mybatis.plus.util.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ActorRepositoryTest extends BaseTest {
    private static final Random RANDOM = new Random();

    @Autowired
    private ActorRepository actorRepository;

    @Test
    public void testListActor() {
        String firstName1 = "chen";
        String firstName2 = "liu";
        String lastName1 = "tong";
        String lastName2 = "jing";
        Actor actor1 = createActor(firstName1, lastName1);
        Actor actor2 = createActor(firstName1, lastName2);
        Actor actor3 = createActor(firstName2, lastName1);
        Actor actor4 = createActor(firstName2, lastName2);
        actorRepository.saveBatch(Arrays.asList(actor1, actor2, actor3, actor4));

        List<Actor> actors = actorRepository.listActor(firstName1, lastName1);
        Assert.assertEquals(1, actors.size());
        actors = actorRepository.listActor(firstName1, null);
        Assert.assertEquals(0, actors.size());
    }

    private Actor createActor(String firstName, String lastName) {
        Actor actor = new Actor();
        actor.setActorId(Math.abs(RANDOM.nextInt()));
        actor.setFirstName(firstName);
        actor.setLastName(lastName);
        actor.setLastUpdate(LocalDateTime.now());

        return actor;
    }
}
