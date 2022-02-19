package com.hrm.hasset.controller;

import com.hrm.hasset.dto.EmployeeDTO;
import com.hrm.hasset.entity.Employee;
import com.hrm.hasset.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
        List<EmployeeDTO> lstEmployees = employeeService.getAllEmployees();
        return ResponseEntity.status(HttpStatus.OK).body(lstEmployees);
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable(value = "id") Integer id){
        if(id!=null){
            EmployeeDTO employee = employeeService.getEmployeeById(id);
            return ResponseEntity.status(HttpStatus.OK).body(employee);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    @PostMapping("/employee")
    public void createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
    }
    @PostMapping("/employees")
    public void createEmployees(@RequestBody List<Employee> lstEmployees){
        employeeService.createEmployees(lstEmployees);
    }
    @PutMapping("/employee")
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/employee")
    public void deactivateEmployee(@RequestBody Employee employee){
        employeeService.deactivateEmployee(employee);
    }
}
