package com.hrm.hasset.repo;

import com.hrm.hasset.entity.SickLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SickLeaveRepository extends JpaRepository<SickLeave, Integer>, JpaSpecificationExecutor<SickLeave> {

}
