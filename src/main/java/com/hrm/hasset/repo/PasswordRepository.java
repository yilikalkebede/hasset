package com.hrm.hasset.repo;

import com.hrm.hasset.entity.Password;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PasswordRepository extends JpaRepository<Password, Integer>, JpaSpecificationExecutor<Password> {

}
