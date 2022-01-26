package com.hrm.hasset.repo;

import com.hrm.hasset.entity.JobCandidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface JobCandidateRepository extends JpaRepository<JobCandidate, Integer>, JpaSpecificationExecutor<JobCandidate> {

}
