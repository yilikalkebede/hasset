package com.hrm.hasset.repo;

import com.hrm.hasset.entity.Directory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DirectoryRepository extends JpaRepository<Directory, String>, JpaSpecificationExecutor<Directory> {

}
