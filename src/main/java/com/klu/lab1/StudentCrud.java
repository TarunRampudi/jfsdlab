package com.klu.lab1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class StudentCrud {
 private static final SessionFactory factory;
 static {
 factory = new Configuration().configure("hibernate.cfg.xml")
 .addAnnotatedClass(Student.class)
 .buildSessionFactory();
 }
 public void insertStudent(Student student) {
 try (Session session = factory.openSession()) {
 session.beginTransaction();
 session.save(student);
 session.getTransaction().commit();
 }
 }
 public Student fetchStudent(int id) {
 try (Session session = factory.openSession()) {
 session.beginTransaction();
 Student student = session.get(Student.class, id);
 session.getTransaction().commit();
 return student;
 }
 }
 public void updateStudent(int id, Student updatedStudent) {
 try (Session session = factory.openSession()) {
 session.beginTransaction();
 Student student = session.get(Student.class, id);
 if (student != null) {
 student.setName(updatedStudent.getName());
 student.setGender(updatedStudent.getGender());
 student.setDepartment(updatedStudent.getDepartment());
 student.setProgram(updatedStudent.getProgram());
 student.setDateOfBirth(updatedStudent.getDateOfBirth());
 student.setContactNumber(updatedStudent.getContactNumber());
 student.setGraduationStatus(updatedStudent.getGraduationStatus());
 student.setCgpa(updatedStudent.getCgpa());
 student.setBacklogs(updatedStudent.getBacklogs());
 session.update(student);
 }
 session.getTransaction().commit();
 }
 }
 public void deleteStudent(int id) {
 try (Session session = factory.openSession()) {
 session.beginTransaction();
 Student student = session.get(Student.class, id);
 if (student != null) {
 session.delete(student);
 }
 session.getTransaction().commit();
 }
 }
}
