package com.hrm.hasset.repo;

import com.hrm.hasset.entity.BusinessEntityEmployees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BusinessEntityEmployeesRepository extends JpaRepository<BusinessEntityEmployees, Integer>, JpaSpecificationExecutor<BusinessEntityEmployees> {

}
