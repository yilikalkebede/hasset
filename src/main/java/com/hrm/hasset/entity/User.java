package com.hrm.hasset.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "activation_date")
    private Timestamp activationDate;

    @Column(name = "active_flag")
    private String activeFlag;

    @Column(name = "authentication_type")
    private String authenticationType;

    @Column(name = "last_failed_login")
    private Timestamp lastFailedLogin;

    @Column(name = "last_login")
    private Timestamp lastLogin;

    @Column(name = "login_attempts")
    private Integer loginAttempts;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date", nullable = false)
    private Timestamp modifiedDate;

    @Column(name = "business_entity_id")
    private Integer businessEntityId;
/*
    @Column(name = "employee_id")
    private Integer employeeId;
*/
    @JsonBackReference
    @OneToOne(mappedBy = "user")
    private Employee employee;
}
