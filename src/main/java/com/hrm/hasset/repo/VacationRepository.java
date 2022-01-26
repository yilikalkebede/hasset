package com.hrm.hasset.repo;

import com.hrm.hasset.entity.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VacationRepository extends JpaRepository<Vacation, Integer>, JpaSpecificationExecutor<Vacation> {

}
