package io.github.ctlove0523.mybatis.plus.db.entity;

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
@TableName(value = "city", autoResultMap = true)
public class City {
    @TableId("city_id")
    private Integer cityId;

    @TableField("city")
    private String city;

    @TableField("country_id")
    private Integer countryId;

    @TableField("last_update")
    private LocalDateTime lastUpdate;

}
