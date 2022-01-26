package com.hrm.hasset.repo;

import com.hrm.hasset.entity.EmailAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmailAddressRepository extends JpaRepository<EmailAddress, Integer>, JpaSpecificationExecutor<EmailAddress> {

}
