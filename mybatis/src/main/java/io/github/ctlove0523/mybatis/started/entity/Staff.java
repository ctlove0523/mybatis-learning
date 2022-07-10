package io.github.ctlove0523.mybatis.started.entity;

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
public class Staff {

    private Integer staffId;

    private String firstName;

    private String lastName;

    private Integer addressId;

    private Blob picture;

    private String email;

    private Integer storeId;

    private Boolean active;

    private String username;

    private String password;

    private LocalDateTime lastUpdate;
}
