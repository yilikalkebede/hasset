package com.hrm.hasset.repo;

import com.hrm.hasset.entity.BusinessEntityContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BusinessEntityContactRepository extends JpaRepository<BusinessEntityContact, Integer>, JpaSpecificationExecutor<BusinessEntityContact> {

}
