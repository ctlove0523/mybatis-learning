package io.github.ctlove0523.mybatis.plus.db.repository.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.ctlove0523.mybatis.plus.db.entity.Actor;
import io.github.ctlove0523.mybatis.plus.db.mapper.ActorMapper;
import io.github.ctlove0523.mybatis.plus.db.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorRepositoryImpl extends ServiceImpl<ActorMapper, Actor> implements ActorRepository {
    @Override
    public List<Actor> listActor(String firstName, String lastName) {
        Wrapper<Actor> queryWrapper = Wrappers.lambdaQuery(Actor.class)
                .eq(Actor::getFirstName, firstName)
                .eq(Actor::getLastName, lastName);
        return list(queryWrapper);
    }
}
