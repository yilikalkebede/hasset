package com.hrm.hasset.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name = "vacation")
public class Vacation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "vacation_category")
    private String vacationCategory;

    @Column(name = "vacation_days")
    private Integer vacationDays;

    @Column(name = "business_entity_id")
    private Integer businessEntityId;

    @JsonBackReference
    @OneToMany(mappedBy = "vacation")
    private Set<Employee> employees;

}
