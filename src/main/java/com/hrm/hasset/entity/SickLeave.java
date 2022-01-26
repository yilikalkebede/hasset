package com.hrm.hasset.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name = "sick_leave")
public class SickLeave implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "sick_leave_category")
    private String sickLeaveCategory;

    @Column(name = "sick_leave_days")
    private Integer sickLeaveDays;


    @Column(name = "business_entity_id")
    private Integer businessEntityId;

    @JsonBackReference
    @OneToMany(mappedBy = "sickLeave")
    private Set<Employee> employees;

}
