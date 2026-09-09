package com.studentmanagement.model;

public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentCourse;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public Student(int studentId, String studentName, int studentAge, String studentCourse) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentCourse = studentCourse;
    }

    // toString() ek method hai jo object ko String/text representation mein convert karke return karta hai.


    @Override
    public String toString() {
        return "Student ID: " + studentId
                + ", Name: " + studentName
                + ", Age: " + studentAge
                + ", Course: " + studentCourse;
    }

}
