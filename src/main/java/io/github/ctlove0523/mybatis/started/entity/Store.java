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
@TableName("store")
public class Store {

    @TableId(value = "store_id", type = IdType.AUTO)
    private Integer storeId;

    @TableField("manager_staff_id")
    private Integer managerStaffId;

    @TableField("address_id")
    private Integer addressId;

    @TableField("last_update")
    private LocalDateTime lastUpdate;


}
