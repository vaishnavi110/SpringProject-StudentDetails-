package com.StudentDeatails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")
public class studentdetails {
    @Id
    private int studId;
    private String studName;
    private String studDept;
    private String studAddress;

    public studentdetails() {
    }

    public studentdetails(int studId, String studName, String studDept, String studAddress) {
        this.studId = studId;
        this.studName = studName;
        this.studDept = studDept;
        this.studAddress = studAddress;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudDept() {
        return studDept;
    }

    public void setStudDept(String studDept) {
        this.studDept = studDept;
    }

    public String getStudAddress() {
        return studAddress;
    }

    public void setStudAddress(String studAddress) {
        this.studAddress = studAddress;
    }
}
