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
@TableName("rental")
public class Rental {

    @TableId(value = "rental_id", type = IdType.AUTO)
    private Integer rentalId;

    @TableField("rental_date")
    private LocalDateTime rentalDate;

    @TableField("inventory_id")
    private Integer inventoryId;

    @TableField("customer_id")
    private Integer customerId;

    @TableField("return_date")
    private LocalDateTime returnDate;

    @TableField("staff_id")
    private Integer staffId;

    @TableField("last_update")
    private LocalDateTime lastUpdate;


}
