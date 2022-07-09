package io.github.ctlove0523.mybatis.started.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author ctlove0523
 * @since 2022-07-05
 */
@Getter
@Setter
@TableName("film_actor")
public class FilmActor {

    @TableId("actor_id")
    private Integer actorId;

    @TableId("film_id")
    private Integer filmId;

    @TableField("last_update")
    private LocalDateTime lastUpdate;


}
