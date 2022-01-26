package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "person")
@Data
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "activation_date")
    private Timestamp activationDate;

    @Column(name = "active_flag")
    private String activeFlag;

    @Column(name = "additional_contact_info")
    private String additionalContactInfo;

    @Column(name = "authentication_type")
    private String authenticationType;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "deactivation_date")
    private Timestamp deactivationDate;

    @Column(name = "deleted_flag")
    private String deletedFlag;

    @Column(name = "demographics")
    private String demographics;

    @Column(name = "departure_date")
    private Timestamp departureDate;

    @Column(name = "email_promotion", nullable = false)
    private Integer emailPromotion;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_failed_login")
    private Timestamp lastFailedLogin;

    @Column(name = "last_login")
    private Timestamp lastLogin;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "login_attempts")
    private Integer loginAttempts;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date", nullable = false)
    private Timestamp modifiedDate;

    @Column(name = "name_style", nullable = false)
    private Integer nameStyle;

    @Column(name = "person_type")
    private String personType;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "suffix")
    private String suffix;

    @Column(name = "title")
    private String title;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "business_entity_id")
    private Integer businessEntityId;

    @Column(name = "business_entity_contact_id")
    private Integer businessEntityContactId;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "address_id")
    private Integer addressId;

}
