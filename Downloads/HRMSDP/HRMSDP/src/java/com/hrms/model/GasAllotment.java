package com.hrms.model;
// Generated Dec 16, 2016 10:52:21 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * GasAllotment generated by hbm2java
 */
public class GasAllotment  implements java.io.Serializable {


     private Integer id;
     private EmployeeProfile employeeProfile;
     private GasConnectionMaster gasConnectionMaster;
     private String status;
     private Date allotedDate;
     private Date closedDate;

    public GasAllotment() {
    }

	
    public GasAllotment(EmployeeProfile employeeProfile, Date allotedDate) {
        this.employeeProfile = employeeProfile;
        this.allotedDate = allotedDate;
    }
    public GasAllotment(EmployeeProfile employeeProfile, GasConnectionMaster gasConnectionMaster, String status, Date allotedDate, Date closedDate) {
       this.employeeProfile = employeeProfile;
       this.gasConnectionMaster = gasConnectionMaster;
       this.status = status;
       this.allotedDate = allotedDate;
       this.closedDate = closedDate;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public EmployeeProfile getEmployeeProfile() {
        return this.employeeProfile;
    }
    
    public void setEmployeeProfile(EmployeeProfile employeeProfile) {
        this.employeeProfile = employeeProfile;
    }
    public GasConnectionMaster getGasConnectionMaster() {
        return this.gasConnectionMaster;
    }
    
    public void setGasConnectionMaster(GasConnectionMaster gasConnectionMaster) {
        this.gasConnectionMaster = gasConnectionMaster;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getAllotedDate() {
        return this.allotedDate;
    }
    
    public void setAllotedDate(Date allotedDate) {
        this.allotedDate = allotedDate;
    }
    public Date getClosedDate() {
        return this.closedDate;
    }
    
    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }




}

