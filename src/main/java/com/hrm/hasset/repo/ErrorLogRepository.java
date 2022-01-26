package com.hrm.hasset.repo;

import com.hrm.hasset.entity.ErrorLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ErrorLogRepository extends JpaRepository<ErrorLog, Integer>, JpaSpecificationExecutor<ErrorLog> {

}
