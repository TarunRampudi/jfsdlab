package com.klu.lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class App {
 private static final StudentCrud studentDAO = new StudentCrud();
 public static void main(String[] args) throws ParseException {
 Scanner scanner = new Scanner(System.in);
 String continueInsert;
 do {
 System.out.println("Do you want to insert student details? (yes/no)");
 continueInsert = scanner.nextLine();
 if (continueInsert.equalsIgnoreCase("yes")) {
 Student student = new Student();
 System.out.print("Enter Id: ");
 student.setId(scanner.nextInt());
 scanner.nextLine(); 
 System.out.print("Enter Name: ");
 student.setName(scanner.nextLine());
 System.out.print("Enter Gender: ");
 student.setGender(scanner.nextLine());
 System.out.print("Enter Department: ");
 student.setDepartment(scanner.nextLine());
 System.out.print("Enter Program: ");
 student.setProgram(scanner.nextLine());
 System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
 String dob = scanner.nextLine();
 student.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse(dob));
 System.out.print("Enter Contact Number: ");
 student.setContactNumber(scanner.nextLine());
 System.out.print("Enter Graduation Status: ");
 student.setGraduationStatus(scanner.nextLine());
 System.out.print("Enter CGPA: ");
 student.setCgpa(scanner.nextDouble());
 System.out.print("Enter Number of Backlogs: ");
 student.setBacklogs(scanner.nextInt());
 scanner.nextLine();
 studentDAO.insertStudent(student);
 System.out.println("Student details inserted successfully.");
 }
 } while (continueInsert.equalsIgnoreCase("yes"));
 
 System.out.println("Enter the student id to fetch:");
 int id = scanner.nextInt();
 Student student = studentDAO.fetchStudent(id);
 if (student != null) {
 System.out.println(student);
 } else {
 System.out.println("Student not found!");
 }
 
 System.out.println("Do you want to update student details? (yes/no)");
 String continueUpdate = scanner.next();
 if (continueUpdate.equalsIgnoreCase("yes")) {
 System.out.println("Enter the student id to update:");
 int updateId = scanner.nextInt();
 scanner.nextLine(); // Consume the newline character
 Student updateStudent = new Student();
 System.out.print("Enter Name: ");
 updateStudent.setName(scanner.nextLine());
 System.out.print("Enter Gender: ");
 updateStudent.setGender(scanner.nextLine());
 System.out.print("Enter Department: ");
 updateStudent.setDepartment(scanner.nextLine());
 System.out.print("Enter Program: ");
 updateStudent.setProgram(scanner.nextLine());
 System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
 String dob = scanner.nextLine();
 updateStudent.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse(dob));
 System.out.print("Enter Contact Number: ");
 updateStudent.setContactNumber(scanner.nextLine());
 System.out.print("Enter Graduation Status: ");
 updateStudent.setGraduationStatus(scanner.nextLine());
 System.out.print("Enter CGPA: ");
 updateStudent.setCgpa(scanner.nextDouble());
 System.out.print("Enter Number of Backlogs: ");
 updateStudent.setBacklogs(scanner.nextInt());
 scanner.nextLine(); 
 studentDAO.updateStudent(updateId, updateStudent);
 System.out.println("Student details updated successfully.");
 }
 System.out.println("Do you want to delete a student? (yes/no)");
 String continueDelete = scanner.next();
 if (continueDelete.equalsIgnoreCase("yes")) {
 System.out.println("Enter the student id to delete:");
 int deleteId = scanner.nextInt();
 studentDAO.deleteStudent(deleteId);
 System.out.println("Student record deleted successfully.");
 }
 scanner.close();
 }
}
