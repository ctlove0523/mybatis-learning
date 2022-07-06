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
@TableName("customer")
public class Customer {

    @TableId(value = "customer_id", type = IdType.AUTO)
    private Integer customerId;

    @TableField("store_id")
    private Integer storeId;

    @TableField("first_name")
    private String firstName;

    @TableField("last_name")
    private String lastName;

    @TableField("email")
    private String email;

    @TableField("address_id")
    private Integer addressId;

    @TableField("active")
    private Boolean active;

    @TableField("create_date")
    private LocalDateTime createDate;

    @TableField("last_update")
    private LocalDateTime lastUpdate;

}
