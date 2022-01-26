package com.hrm.hasset.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@Table(name = "state_province")
public class StateProvince implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "modified_date", nullable = false)
    private Timestamp modifiedDate;

    @Column(name = "name")
    private String name;

    @Column(name = "is_only_state_province_flag", nullable = false)
    private Boolean onlyStateProvinceFlag;

    @Column(name = "state_province_id_code")
    private String stateProvinceIdCode;

    @JsonBackReference
    @OneToMany(mappedBy = "stateProvince")
    private Set<Address> addresses;

}
