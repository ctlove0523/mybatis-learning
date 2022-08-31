package io.github.ctlove0523.mybatis.plus.db.repository;

import com.baomidou.mybatisplus.extension.service.IService;
import io.github.ctlove0523.mybatis.plus.db.entity.Actor;

import java.util.List;

public interface ActorRepository extends IService<Actor> {

    List<Actor> listActor(String firstName, String lastName);
}
