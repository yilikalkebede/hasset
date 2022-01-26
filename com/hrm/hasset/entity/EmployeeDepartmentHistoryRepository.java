package com.hrm.hasset.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeDepartmentHistoryRepository extends JpaRepository<EmployeeDepartmentHistory, Integer>, JpaSpecificationExecutor<EmployeeDepartmentHistory> {

}
