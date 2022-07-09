package io.github.ctlove0523.mybatis.started.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.ctlove0523.mybatis.started.entity.Actor;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ctlove0523
 * @since 2022-07-05
 */
public interface ActorMapper extends BaseMapper<Actor> {

    Actor selectActor(int id);
}