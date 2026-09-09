package com.studentmanagement.main;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;

import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        boolean running = true;
        while (running) {

            System.out.println("\n==============================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("==============================");

            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Student Course: ");
                    String course = scanner.nextLine();

                    Student student = new Student(id, name, age, course);

                    service.addStudent(student);
                    break;

                case 2:
                    service.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = scanner.nextInt();

                    service.searchStudent(searchId);
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int updateId = scanner.nextInt();

                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();

                    scanner.nextLine();
                    System.out.print("Enter New Course: ");
                    String newCourse = scanner.nextLine();

                    service.updateStudent(updateId, newName, newAge, newCourse);
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int deleteId = scanner.nextInt();
                    service.deleteStudent(deleteId);

                    break;
                case 6:

                    running = false;
                    System.out.println("Thank you for using Student Management System!");

                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}


