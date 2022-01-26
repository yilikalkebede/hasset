package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "business_entity")
public class BusinessEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "business_industry")
    private String businessIndustry;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "business_type")
    private String businessType;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "logo_image")
    private String logoImage;

    @Column(name = "modified_date", nullable = false)
    private Timestamp modifiedDate;

}
