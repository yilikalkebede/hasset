package com.hrm.hasset.repo;

import com.hrm.hasset.entity.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, Integer>, JpaSpecificationExecutor<EmployeeAddress> {

}
