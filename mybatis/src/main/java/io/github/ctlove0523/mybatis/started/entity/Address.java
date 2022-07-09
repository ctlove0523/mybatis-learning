package io.github.ctlove0523.mybatis.started.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("address")
public class Address {

    @TableId(value = "address_id", type = IdType.AUTO)
    private Integer addressId;

    @TableField("address")
    private String address;

    @TableField("address2")
    private String address2;

    @TableField("district")
    private String district;

    @TableField("city_id")
    private Integer cityId;

    @TableField("postal_code")
    private String postalCode;

    @TableField("phone")
    private String phone;

    @TableField("location")
    private String location;

    @TableField("last_update")
    private LocalDateTime lastUpdate;


}
