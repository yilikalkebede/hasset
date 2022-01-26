package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "address")
@Data
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "modified_date")
    private Timestamp modifiedDate;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "spatial_location")
    private String spatialLocation;

    @Column(name = "address_type_id")
    private Integer addressTypeId;

    @Column(name = "business_entity_id")
    private Integer businessEntityId;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "state_province_id")
    private Integer stateProvinceId;

    @Column(name = "person_id")
    private Integer personId;

}
