package com.hrm.hasset.repo;

import com.hrm.hasset.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor<Employee> {

@Query(value = "SELECT e FROM Employee e WHERE e.currentFlag = true")
List<Employee> findAllCurrentEmployees();

@Query(value = "SELECT e FROM Employee e WHERE e.currentFlag = true AND e.id = ?1")
Optional<Employee> findCurrentEmployeeById(Integer id);

}
