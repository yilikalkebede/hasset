package com.hrm.hasset.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {
    private String firstName;
    private String middleName;
    private String lastName;
    private java.sql.Date birthDate;
    private String gender;
    private java.sql.Date hireDate;
}
