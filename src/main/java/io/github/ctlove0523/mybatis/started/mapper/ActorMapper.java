package io.github.ctlove0523.mybatis.started.mapper;

import io.github.ctlove0523.mybatis.started.model.Actor;

public interface ActorMapper {

    Actor selectActor(int actorId);
}
