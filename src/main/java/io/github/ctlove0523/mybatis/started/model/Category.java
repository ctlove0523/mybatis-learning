package io.github.ctlove0523.mybatis.started.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Category {
    private String categoryId;
    private String name;
    private LocalDateTime lastUpdate;
}
