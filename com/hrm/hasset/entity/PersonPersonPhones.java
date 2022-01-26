package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "person_person_phones")
@Data
public class PersonPersonPhones implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "person_id", nullable = false)
    private Integer personId;

    @Id
    @Column(name = "person_phones_id", nullable = false)
    private Integer personPhonesId;

}
