package io.github.ctlove0523.mybatis.started.mapper;

import io.github.ctlove0523.mybatis.started.model.Address;

public interface AddressMapper {

    Address selectAddress(int addressId);
}
