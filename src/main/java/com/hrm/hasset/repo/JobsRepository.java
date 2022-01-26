package com.hrm.hasset.repo;

import com.hrm.hasset.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JobsRepository extends JpaRepository<Jobs, Integer>, JpaSpecificationExecutor<Jobs> {

}
