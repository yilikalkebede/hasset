package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "person_phone")
public class PersonPhone implements Serializable {

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

    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "phone_number_type_id")
    private Integer phoneNumberTypeId;

    @Column(name = "person_phone_id")
    private Integer personPhoneId;

}
