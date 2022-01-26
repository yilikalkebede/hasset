package com.hrm.hasset.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PhoneNumberTypeRepository extends JpaRepository<PhoneNumberType, Integer>, JpaSpecificationExecutor<PhoneNumberType> {

}
