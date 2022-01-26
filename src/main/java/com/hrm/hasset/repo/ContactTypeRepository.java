package com.hrm.hasset.repo;

import com.hrm.hasset.entity.ContactType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ContactTypeRepository extends JpaRepository<ContactType, Integer>, JpaSpecificationExecutor<ContactType> {

}
