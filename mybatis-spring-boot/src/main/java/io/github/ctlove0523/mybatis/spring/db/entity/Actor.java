package io.github.ctlove0523.mybatis.spring.db.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Result;

import java.io.Serializable;
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
public class Actor implements Serializable {

    private Integer actorId;

    private String firstName;
    private String last_name;
    private LocalDateTime lastUpdate;
}
