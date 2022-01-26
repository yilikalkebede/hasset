package com.hrm.hasset.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "shift")
@Data
public class Shift implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "created_date", nullable = false)
    private Timestamp createdDate;

    @Column(name = "end_time")
    private Time endTime;

    @Column(name = "modified_date", nullable = false)
    private Timestamp modifiedDate;

    @Column(name = "name")
    private String name;

    @Column(name = "start_time")
    private Time startTime;

    @JsonBackReference
    @OneToMany(mappedBy = "shift")
    private Set<Employee> employees;

}
