package com.hrm.hasset.repo;

import com.hrm.hasset.entity.EmployeePhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeePhoneRepository extends JpaRepository<EmployeePhone, Integer>, JpaSpecificationExecutor<EmployeePhone> {

}
