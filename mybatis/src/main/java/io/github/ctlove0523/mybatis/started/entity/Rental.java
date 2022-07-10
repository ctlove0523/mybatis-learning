package io.github.ctlove0523.mybatis.started.entity;

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
public class Rental {

    private Integer rentalId;

    private LocalDateTime rentalDate;

    private Integer inventoryId;

    private Integer customerId;

    private LocalDateTime returnDate;

    private Integer staffId;

    private LocalDateTime lastUpdate;
}
