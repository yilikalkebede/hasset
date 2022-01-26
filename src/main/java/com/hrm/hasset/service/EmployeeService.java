package com.hrm.hasset.service;

import com.hrm.hasset.entity.Employee;
import com.hrm.hasset.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees(){

        List<Employee> lstEmployees = employeeRepository.findAll();
        return lstEmployees;
    }
}
