package io.github.ctlove0523.mybatis.spring.db.mapper;

import io.github.ctlove0523.mybatis.spring.db.entity.Actor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ActorMapper {

    @Results(id = "actorResultMap", value = {
            @Result(property = "actorId", column = "actor_id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "last_name", column = "last_name"),
            @Result(property = "lastUpdate",column = "last_update")
    })
    @Select("select * from actor where actor_id = #{id}")
    Actor selectActor(@Param("id") int id);

    @Select("select * from actor")
    @ResultMap(value = "actorResultMap")
    List<Actor> selectAll();
}
