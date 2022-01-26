package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "current_flag", nullable = false)
    private Integer currentFlag;

    @Column(name = "employee_number")
    private String employeeNumber;

    @Column(name = "gender")
    private String gender;

    @Column(name = "hire_date")
    private Date hireDate;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "login_id")
    private String loginId;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "modified_date", nullable = false)
    private Timestamp modifiedDate;

    @Column(name = "salaried_flag", nullable = false)
    private Integer salariedFlag;

    @Column(name = "sick_leave_hours", nullable = false)
    private Integer sickLeaveHours;

    @Column(name = "vacation_hours", nullable = false)
    private Integer vacationHours;

    @Column(name = "business_entity_id")
    private Integer businessEntityId;

    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "shift_id")
    private Integer shiftId;

}
