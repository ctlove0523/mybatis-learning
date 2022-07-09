package io.github.ctlove0523.mybatis.started.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;
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
@TableName("staff")
public class Staff {

    @TableId(value = "staff_id", type = IdType.AUTO)
    private Integer staffId;

    @TableField("first_name")
    private String firstName;

    @TableField("last_name")
    private String lastName;

    @TableField("address_id")
    private Integer addressId;

    @TableField("picture")
    private Blob picture;

    @TableField("email")
    private String email;

    @TableField("store_id")
    private Integer storeId;

    @TableField("active")
    private Boolean active;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("last_update")
    private LocalDateTime lastUpdate;


}
