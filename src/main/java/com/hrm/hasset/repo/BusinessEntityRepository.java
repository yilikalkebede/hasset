package com.hrm.hasset.repo;

import com.hrm.hasset.entity.BusinessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BusinessEntityRepository extends JpaRepository<BusinessEntity, Integer>, JpaSpecificationExecutor<BusinessEntity> {

}
