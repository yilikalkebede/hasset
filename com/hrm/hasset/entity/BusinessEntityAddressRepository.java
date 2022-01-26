package com.hrm.hasset.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BusinessEntityAddressRepository extends JpaRepository<BusinessEntityAddress, Integer>, JpaSpecificationExecutor<BusinessEntityAddress> {

}
