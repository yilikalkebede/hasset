package com.hrm.hasset.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "error_log")
@Data
public class ErrorLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "error_line")
    private Integer errorLine;

    @Column(name = "error_message", nullable = false)
    private String errorMessage;

    @Column(name = "error_number", nullable = false)
    private Integer errorNumber;

    @Column(name = "error_procedure")
    private String errorProcedure;

    @Column(name = "error_severity")
    private Integer errorSeverity;

    @Column(name = "error_state")
    private Integer errorState;

    @Column(name = "error_time", nullable = false)
    private Timestamp errorTime;

    @Column(name = "user_name", nullable = false)
    private String userName;

}
