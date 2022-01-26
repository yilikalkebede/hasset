package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "business_entity_address")
public class BusinessEntityAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "is_head_quarter")
    private Boolean headQuarter;

    @Column(name = "modified_date", nullable = false)
    private Timestamp modifiedDate;

    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "address_type_id")
    private Integer addressTypeId;

    @Column(name = "business_entity_id")
    private Integer businessEntityId;

}
