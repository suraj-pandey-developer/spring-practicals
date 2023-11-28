package com.mapping.onetooneunidirectional.repository;

import com.mapping.onetooneunidirectional.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address , Integer> {
}
