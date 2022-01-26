package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "employee_department_history")
@Data
public class EmployeeDepartmentHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "modified_date", nullable = false)
    private Timestamp modifiedDate;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "employee_id")
    private Integer employeeId;

}
