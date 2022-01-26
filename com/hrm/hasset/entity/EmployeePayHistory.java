package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "employee_pay_history")
public class EmployeePayHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "modified_date", nullable = false)
    private Timestamp modifiedDate;

    @Column(name = "pay_frequency")
    private Integer payFrequency;

    @Column(name = "rate")
    private BigDecimal rate;

    @Column(name = "rate_change_date")
    private Timestamp rateChangeDate;

    @Column(name = "employee_id")
    private Integer employeeId;

}
