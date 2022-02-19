package com.hrm.hasset.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Data
@Getter
@Setter
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "name_style")
    private Integer nameStyle;

    @Column(name = "employee_type")
    private String employeeType;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "suffix")
    private String suffix;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "gender")
    private String gender;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "employee_number")
    private String employeeNumber;

    @Column(name = "current_flag")
    private Boolean currentFlag;

    @Column(name = "hire_date")
    private Date hireDate;

    @Column(name = "salaried_flag")
    private Integer salariedFlag;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    private Timestamp modifiedDate;

    @Column(name = "deactivation_flag")
    private Boolean deactivationFlag;

    @Column(name = "deactivation_date")
    private Timestamp deactivationDate;

    @Column(name = "demographics")
    private String demographics;

    @Column(name = "departure_date")
    private Timestamp departureDate;

    @Column(name = "email_promotion")
    private Integer emailPromotion;

    @Column(name = "additional_contact_info")
    private String additionalContactInfo;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "sick_leave_id")
    private SickLeave sickLeave;

    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Jobs jobs;

    @ManyToOne
    @JoinColumn(name = "business_entity_id")
    private BusinessEntity businessEntity;

    @ManyToOne
    @JoinColumn(name = "shift_id")
    private Shift shift;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
