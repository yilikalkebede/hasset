package com.hrm.hasset.dto;

public class EmployeeDTO {
    private Integer id;
    private java.sql.Date birthDate;
    private java.sql.Timestamp createdDate;
    private Integer currentFlag;
    private String employeeNumber;
    private String gender;
    private java.sql.Date hireDate;
    private String jobTitle;
    private String loginId;
    private String maritalStatus;
    private java.sql.Timestamp modifiedDate;
    private Integer salariedFlag;
    private Integer sickLeaveHours;
    private Integer vacationHours;
    private Integer businessEntityId;
    private Integer personId;
    private Integer shiftId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.sql.Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }

    public java.sql.Timestamp getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(java.sql.Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCurrentFlag() {
        return this.currentFlag;
    }

    public void setCurrentFlag(Integer currentFlag) {
        this.currentFlag = currentFlag;
    }

    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public java.sql.Date getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(java.sql.Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLoginId() {
        return this.loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public java.sql.Timestamp getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(java.sql.Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getSalariedFlag() {
        return this.salariedFlag;
    }

    public void setSalariedFlag(Integer salariedFlag) {
        this.salariedFlag = salariedFlag;
    }

    public Integer getSickLeaveHours() {
        return this.sickLeaveHours;
    }

    public void setSickLeaveHours(Integer sickLeaveHours) {
        this.sickLeaveHours = sickLeaveHours;
    }

    public Integer getVacationHours() {
        return this.vacationHours;
    }

    public void setVacationHours(Integer vacationHours) {
        this.vacationHours = vacationHours;
    }

    public Integer getBusinessEntityId() {
        return this.businessEntityId;
    }

    public void setBusinessEntityId(Integer businessEntityId) {
        this.businessEntityId = businessEntityId;
    }

    public Integer getPersonId() {
        return this.personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getShiftId() {
        return this.shiftId;
    }

    public void setShiftId(Integer shiftId) {
        this.shiftId = shiftId;
    }
}
