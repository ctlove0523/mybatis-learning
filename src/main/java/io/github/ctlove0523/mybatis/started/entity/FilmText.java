package io.github.ctlove0523.mybatis.started.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

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
@TableName("film_text")
public class FilmText {

    @TableId("film_id")
    private Integer filmId;

    @TableField("title")
    private String title;

    @TableField("description")
    private String description;


}
