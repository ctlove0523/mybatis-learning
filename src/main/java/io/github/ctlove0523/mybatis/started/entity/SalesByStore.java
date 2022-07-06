package io.github.ctlove0523.mybatis.started.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
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
@TableName("sales_by_store")
public class SalesByStore {

    @TableField("store")
    private String store;

    @TableField("manager")
    private String manager;

    @TableField("total_sales")
    private BigDecimal totalSales;


}