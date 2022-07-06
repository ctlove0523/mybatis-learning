package io.github.ctlove0523.mybatis.started.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
@TableName("city")
public class City {

    @TableId(value = "city_id", type = IdType.AUTO)
    private Integer cityId;

    @TableField("city")
    private String city;

    @TableField("country_id")
    private Integer countryId;

    @TableField("last_update")
    private LocalDateTime lastUpdate;

}
