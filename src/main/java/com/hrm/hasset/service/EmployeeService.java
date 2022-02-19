package com.hrm.hasset.service;

import com.hrm.hasset.dto.EmployeeDTO;
import com.hrm.hasset.entity.Employee;
import com.hrm.hasset.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    // Implement getAllEmployee to get only active employees
    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeDTO> lstEmployeeDTO = new ArrayList<>();
        List<Employee> lstEmployees = employeeRepository.findAllCurrentEmployees();//findAll();
        for (Employee emp : lstEmployees) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setFirstName(emp.getFirstName());
            employeeDTO.setMiddleName(emp.getMiddleName());
            employeeDTO.setLastName(emp.getLastName());
            employeeDTO.setGender(emp.getGender());
            employeeDTO.setBirthDate(emp.getBirthDate());
            employeeDTO.setHireDate(emp.getHireDate());
            lstEmployeeDTO.add(employeeDTO);
        }
        return lstEmployeeDTO;
    }

    public EmployeeDTO getEmployeeById(Integer id) {
        Optional<Employee> emp = employeeRepository.findCurrentEmployeeById(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setFirstName(emp.get().getFirstName());
        employeeDTO.setMiddleName(emp.get().getMiddleName());
        employeeDTO.setLastName(emp.get().getLastName());
        employeeDTO.setGender(emp.get().getGender());
        employeeDTO.setBirthDate(emp.get().getBirthDate());
        employeeDTO.setHireDate(emp.get().getHireDate());

        return employeeDTO;
    }

    public void createEmployee(Employee employee) {
        employee.setCurrentFlag(true);
        employeeRepository.save(employee);
    }

    public void createEmployees(List<Employee> lstEmployees) {
        for(Employee emp: lstEmployees){
            emp.setCurrentFlag(true);
            employeeRepository.save(emp);
        }
    }

    public void updateEmployee(Employee employee) {

            Optional<Employee> updatedEmployee = employeeRepository.findCurrentEmployeeById(employee.getId());
            updatedEmployee.get().setFirstName(employee.getFirstName());
            updatedEmployee.get().setMiddleName(employee.getMiddleName());
            updatedEmployee.get().setLastName(employee.getLastName());
            updatedEmployee.get().setMaritalStatus(employee.getMaritalStatus());
            //employeeRepository.save(updatedEmployee);

    }

    public void deactivateEmployee(Employee employee) {
        if(!employee.getEmployeeNumber().isEmpty()) {
            Optional<Employee> deactivatedEmployee = employeeRepository.findCurrentEmployeeById(employee.getId());
            deactivatedEmployee.get().setCurrentFlag(false);
            //employeeRepository.save(deactivatedEmployee);

        }
    }
}
