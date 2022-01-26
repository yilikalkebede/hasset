package com.hrm.hasset.repo;

import com.hrm.hasset.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ShiftRepository extends JpaRepository<Shift, Integer>, JpaSpecificationExecutor<Shift> {

}
