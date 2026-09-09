package com.studentmanagement.service;

import com.studentmanagement.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {

        for (Student existingStudent : students) {

            if (existingStudent.getStudentId()
                    == student.getStudentId()) {

                System.out.println("Student ID already exists!");
                return;
            }
        }

        students.add(student);

        System.out.println("Student added successfully!");
    }

    public void displayStudents() {

        if (students.isEmpty()) {

            System.out.println("No students available.");
            return;
        }

        for (Student student : students) {

            System.out.println(student);
        }
    }

    public void searchStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {

                System.out.println("Student Found!");
                System.out.println(student);

                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void updateStudent(
            int studentId,
            String newName,
            int newAge,
            String newCourse) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {

                student.setStudentName(newName);
                student.setStudentAge(newAge);
                student.setStudentCourse(newCourse);

                System.out.println(
                        "Student updated successfully!"
                );

                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void deleteStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {

                students.remove(student);

                System.out.println(
                        "Student deleted successfully!"
                );

                return;
            }
        }

        System.out.println("Student not found.");
    }

}
