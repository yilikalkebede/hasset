package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "business_entity_employees")
public class BusinessEntityEmployees implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "business_entity_id", nullable = false)
    private Integer businessEntityId;

    @Id
    @Column(name = "employees_id", nullable = false)
    private Integer employeesId;

}
