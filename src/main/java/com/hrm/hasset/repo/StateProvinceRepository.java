package com.hrm.hasset.repo;

import com.hrm.hasset.entity.StateProvince;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StateProvinceRepository extends JpaRepository<StateProvince, Integer>, JpaSpecificationExecutor<StateProvince> {

}
