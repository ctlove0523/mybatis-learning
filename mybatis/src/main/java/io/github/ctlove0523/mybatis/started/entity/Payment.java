package io.github.ctlove0523.mybatis.started.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
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
public class Payment {

    private Integer paymentId;

    private Integer customerId;

    private Integer staffId;

    private Integer rentalId;

    private BigDecimal amount;

    private LocalDateTime paymentDate;

    private LocalDateTime lastUpdate;

}
