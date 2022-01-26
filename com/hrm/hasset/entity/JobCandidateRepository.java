package com.hrm.hasset.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JobCandidateRepository extends JpaRepository<JobCandidate, Integer>, JpaSpecificationExecutor<JobCandidate> {

}
