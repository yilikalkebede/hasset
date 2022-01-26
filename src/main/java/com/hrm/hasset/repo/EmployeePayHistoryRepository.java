package com.hrm.hasset.repo;

import com.hrm.hasset.entity.EmployeePayHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeePayHistoryRepository extends JpaRepository<EmployeePayHistory, Integer>, JpaSpecificationExecutor<EmployeePayHistory> {

}
