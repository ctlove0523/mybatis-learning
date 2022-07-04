package io.github.ctlove0523.mybatis.started.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Actor {
    private Integer actorId;
    private String firstName;
    private String lastName;
    private LocalDateTime lastUpdate;
}
