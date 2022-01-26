package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "employee_phone")
@Data
public class EmployeePhone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "modified_date", nullable = false)
    private Timestamp modifiedDate;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "phone_number_type_id")
    private Integer phoneNumberTypeId;

    @Column(name = "employee_phone_id")
    private Integer employeePhoneId;

}
