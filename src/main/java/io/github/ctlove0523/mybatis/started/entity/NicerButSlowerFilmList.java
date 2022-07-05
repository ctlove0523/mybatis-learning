package io.github.ctlove0523.mybatis.started.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author ctlove0523
 * @since 2022-07-05
 */
@Getter
@Setter
@TableName("nicer_but_slower_film_list")
public class NicerButSlowerFilmList {

    @TableField("FID")
    private Integer fid;

    @TableField("title")
    private String title;

    @TableField("description")
    private String description;

    @TableField("category")
    private String category;

    @TableField("price")
    private BigDecimal price;

    @TableField("length")
    private Integer length;

    @TableField("rating")
    private String rating;

    @TableField("actors")
    private String actors;


}
