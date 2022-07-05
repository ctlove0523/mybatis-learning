package io.github.ctlove0523.mybatis.started.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
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
@TableName("payment")
public class Payment {

    @TableId(value = "payment_id", type = IdType.AUTO)
    private Integer paymentId;

    @TableField("customer_id")
    private Integer customerId;

    @TableField("staff_id")
    private Integer staffId;

    @TableField("rental_id")
    private Integer rentalId;

    @TableField("amount")
    private BigDecimal amount;

    @TableField("payment_date")
    private LocalDateTime paymentDate;

    @TableField("last_update")
    private LocalDateTime lastUpdate;


}
