package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "business_entity_employees")
public class BusinessEntityEmployees implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "business_entity_id", nullable = false)
    private Integer businessEntityId;


    @Column(name = "employees_id", nullable = false)
    private Integer employeesId;


}
