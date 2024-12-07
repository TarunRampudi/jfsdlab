package com.klu.lab1;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;
@Entity
@Table(name = "students")
public class Student {
 @Id 
 private int id;
 private String name;
 private String gender;
 private String department;
 private String program;
 @Temporal(TemporalType.DATE)
 private Date dateOfBirth;
 private String contactNumber;
 private String graduationStatus;
 private double cgpa;
 private int backlogs;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public String getDepartment() {
return department;
}
public void setDepartment(String department) {
this.department = department;
}
public String getProgram() {
return program;
}
public void setProgram(String program) {
this.program = program;
}
public Date getDateOfBirth() {
return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}
public String getContactNumber() {
return contactNumber;
}
public void setContactNumber(String contactNumber) {
this.contactNumber = contactNumber;
}
public String getGraduationStatus() {
return graduationStatus;
}
public void setGraduationStatus(String graduationStatus) {
this.graduationStatus = graduationStatus;
}
public double getCgpa() {
return cgpa;
}
public void setCgpa(double cgpa) {
this.cgpa = cgpa;
}
public int getBacklogs() {
return backlogs;
}
public void setBacklogs(int backlogs) {
this.backlogs = backlogs;
}
@Override
 public String toString() {
 return "Student{" +
 "id=" + id +
 ", name='" + name + '\'' +
 ", gender='" + gender + '\'' +
 ", department='" + department + '\'' +
 ", program='" + program + '\'' +
 ", dateOfBirth=" + dateOfBirth +
 ", contactNumber='" + contactNumber + '\'' +
 ", graduationStatus='" + graduationStatus + '\'' +
 ", cgpa=" + cgpa +
 ", backlogs=" + backlogs +
 '}';
 }
}
