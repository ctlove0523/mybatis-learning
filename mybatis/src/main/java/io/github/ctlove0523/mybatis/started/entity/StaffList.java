package io.github.ctlove0523.mybatis.started.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("staff_list")
public class StaffList {

    @TableField("ID")
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("address")
    private String address;

    @TableField("zip code")
    private String zipCode;

    @TableField("phone")
    private String phone;

    @TableField("city")
    private String city;

    @TableField("country")
    private String country;

    @TableField("SID")
    private Integer sid;


}
