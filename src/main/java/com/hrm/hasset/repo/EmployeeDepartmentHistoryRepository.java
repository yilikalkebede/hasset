package com.hrm.hasset.repo;

import com.hrm.hasset.entity.EmployeeDepartmentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeDepartmentHistoryRepository extends JpaRepository<EmployeeDepartmentHistory, Integer>, JpaSpecificationExecutor<EmployeeDepartmentHistory> {

}
