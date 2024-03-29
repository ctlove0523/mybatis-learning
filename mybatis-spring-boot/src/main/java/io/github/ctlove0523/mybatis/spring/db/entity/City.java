package io.github.ctlove0523.mybatis.spring.db.entity;

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
@TableName(autoResultMap = true)
public class City {

    private Integer cityId;

    private String city;

    private Integer countryId;

    private LocalDateTime lastUpdate;

}
