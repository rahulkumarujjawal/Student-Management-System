# Student-Management-System
☕ Core Java | 🧩 OOPs | 📦 Collections | 🛡️ Exception Handling | 🔄 CRUD Operations | 🚀 Learning Project
 # 🎓 Student Management System

<p align="center">

### 🚀 Core Java Mini Project

A console-based **Student Management System** built to practice and demonstrate
**Core Java concepts through a real-world application.**

<br>

<img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java 21"/>
<img src="https://img.shields.io/badge/Core%20Java-OOPs-blue?style=for-the-badge" alt="Core Java"/>
<img src="https://img.shields.io/badge/Collections-ArrayList-green?style=for-the-badge" alt="Collections"/>
<img src="https://img.shields.io/badge/Exception-Handling-red?style=for-the-badge" alt="Exception Handling"/>

</p>

---

## 🌟 About The Project

**Student Management System** is a menu-driven console application developed using **Core Java**.

The main purpose of this project is to understand how different Java concepts work together to build a simple real-world application.

### 💡 What can this application do?
➕ Add Student
📋 Display Students
🔍 Search Student
✏️ Update Student
🗑️ Delete Student
🚪 Exit Application
```

---

# ✨ Features

| #    | Feature              | Description                                     |
| ---- | -------------------- | ----------------------------------------------- |
| 🟢 1 | **Add Student**      | Add a new student with ID, name, age and course |
| 🔵 2 | **Display Students** | Display all registered students                 |
| 🟡 3 | **Search Student**   | Search a student using Student ID               |
| 🟠 4 | **Update Student**   | Update existing student information             |
| 🔴 5 | **Delete Student**   | Delete a student using Student ID               |
| ⚫ 6  | **Exit**             | Safely exit the application                     |

---

# 🛠️ Technologies & Concepts

### ☕ Core Java

```text
Java
├── Variables
├── Data Types
├── Operators
├── Conditions
├── if / else
├── switch
├── Loops
├── Methods
├── Classes & Objects
├── Constructors
├── this Keyword
├── Encapsulation
├── Collections
├── ArrayList
├── Exception Handling
└── Scanner
```

---

# 🧠 Java Concepts Used

| Java Concept          | Where It Is Used                 |
| --------------------- | -------------------------------- |
| 🔹 Variables          | Store student information        |
| 🔹 Data Types         | `int`, `String`, `boolean`       |
| 🔹 Classes            | `Student`, `StudentService`      |
| 🔹 Objects            | Create Student objects           |
| 🔹 Constructor        | Initialize Student objects       |
| 🔹 `this`             | Refer to current object          |
| 🔹 Encapsulation      | Private fields + getters/setters |
| 🔹 Methods            | Add, search, update, delete      |
| 🔹 Conditions         | Data validation                  |
| 🔹 `switch`           | Menu selection                   |
| 🔹 `while`            | Keep application running         |
| 🔹 `for-each`         | Iterate through students         |
| 🔹 Collection         | Store multiple students          |
| 🔹 ArrayList          | Store Student objects            |
| 🔹 Exception Handling | Handle invalid input             |
| 🔹 Scanner            | Take user input                  |
| 🔹 `toString()`       | Display student details          |

---

# 🏗️ Project Architecture

```text
                    👤 USER
                      │
                      ▼
        ┌──────────────────────────┐
        │ StudentManagementApp.java│
        │                          │
        │  Menu + User Input       │
        └────────────┬─────────────┘
                     │
                     ▼
        ┌──────────────────────────┐
        │    StudentService.java   │
        │                          │
        │ Add                      │
        │ Display                  │
        │ Search                   │
        │ Update                   │
        │ Delete                   │
        └────────────┬─────────────┘
                     │
                     ▼
        ┌──────────────────────────┐
        │    ArrayList<Student>    │
        │                          │
        │  Student Objects         │
        └────────────┬─────────────┘
                     │
                     ▼
              ┌─────────────┐
              │ Student.java│
              │             │
              │ ID          │
              │ Name        │
              │ Age         │
              │ Course      │
              └─────────────┘
```

---

# 📁 Project Structure
📦 Student-Management-System
│
├── 📂 src
│   └── 📂 com
│       └── 📂 studentmanagement
│           │
│           ├── 📄 Student.java
│           ├── 📄 StudentService.java
│           └── 📄 StudentManagementApp.java
│
├── 📄 .gitignore
├── 📄 README.md
└── 📄 LICENSE
```

---

# 📌 Class Responsibilities

## 👨‍🎓 Student.java

This class represents the **Student entity**.

### Contains:

```text
🆔 Student ID
👤 Student Name
🎂 Student Age
📚 Student Course
```

It also contains:

* Constructor
* Getters
* Setters
* `toString()`

Example:

```java
Student student =
        new Student(101, "Rahul", 25, "Java");
```

---

## ⚙️ StudentService.java

This class contains the **business logic** of the application.

### Main methods:

```java
addStudent()
displayStudents()
searchStudent()
updateStudent()
deleteStudent()
```

Student records are maintained using:

```java
List<Student> students = new ArrayList<>();
```

---

## 🖥️ StudentManagementApp.java

This is the **main application class**.

It is responsible for:

```text
🎯 Starting application
⌨️ Taking user input
📋 Displaying menu
🔀 Handling choices
⚠️ Handling invalid input
🔁 Running application continuously
🚪 Exiting application
```

---

# 🔄 Application Flow

```text
                 🚀 START
                    │
                    ▼
             📋 Display Menu
                    │
                    ▼
             ⌨️ User Choice
                    │
        ┌───────────┼────────────┐
        │           │            │
        ▼           ▼            ▼
     ➕ ADD      📋 DISPLAY    🔍 SEARCH
        │           │            │
        └───────────┼────────────┘
                    │
        ┌───────────┼────────────┐
        │           │            │
        ▼           ▼            ▼
     ✏️ UPDATE   🗑️ DELETE    🚪 EXIT
        │           │            │
        └───────────┼────────────┘
                    │
                    ▼
             🔁 Show Menu Again
                    │
                    ▼
                 Continue
```

---

# ➕ 1. Add Student

User selects:

```text
1. Add Student
```

Then application asks:

```text
Enter Student ID: 101
Enter Student Name: Rahul
Enter Student Age: 25
Enter Student Course: Java
```

A Student object is created:

```java
Student student =
        new Student(101, "Rahul", 25, "Java");
```

Then it is stored in:

```java
students.add(student);
```

### Result

```text
✅ Student added successfully!
```

---

# 📋 2. Display Students

User selects:

```text
2. Display Students
```

The application iterates through the `ArrayList`.

```java
for (Student student : students) {
    System.out.println(student);
}
```

### Example Output

```text
Student ID: 101, Name: Rahul, Age: 25, Course: Java

Student ID: 102, Name: Amit, Age: 24, Course: Spring Boot
```

---

# 🔍 3. Search Student

User selects:

```text
3. Search Student
```

Then enters:

```text
Enter Student ID to search: 101
```

The application checks each student:

```java
if (student.getStudentId() == studentId)
```

If ID matches:

```text
✅ Student Found!
```

Otherwise:

```text
❌ Student not found.
```

---

# ✏️ 4. Update Student

User selects:

```text
4. Update Student
```

Example:

```text
Enter Student ID to update: 101

Enter New Name: Rahul Kumar
Enter New Age: 26
Enter New Course: Spring Boot
```

The existing object is updated using setters:

```java
student.setStudentName(newName);
student.setStudentAge(newAge);
student.setStudentCourse(newCourse);
```

Result:

```text
✅ Student updated successfully!
```

---

# 🗑️ 5. Delete Student

User selects:

```text
5. Delete Student
```

Example:

```text
Enter Student ID to delete: 101
```

The matching object is removed from the collection:

```java
students.remove(student);
```

Result:

```text
✅ Student deleted successfully!
```

---

# 🚪 6. Exit

User selects:

```text
6. Exit
```

The application changes:

```java
running = false;
```

The `while` loop stops and the application terminates.

```text
👋 Thank you for using Student Management System!
```

---

# ⚠️ Exception Handling

The application handles invalid user input using `try-catch`.

```java
try {

    int choice = scanner.nextInt();

} catch (Exception e) {

    System.out.println(
        "Invalid input! Please enter valid data."
    );

    scanner.nextLine();
}
```

For example, if the application expects:

```text
Enter Student Age: 25
```

but the user enters:

```text
abc
```

the application handles the error instead of crashing.

---

# 🎬 Sample Application

```text
=================================
     STUDENT MANAGEMENT SYSTEM
=================================

1. Add Student
2. Display Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit

Enter your choice: 1

Enter Student ID: 101
Enter Student Name: Rahul
Enter Student Age: 25
Enter Student Course: Java

✅ Student added successfully!

# ▶️ How To Run

## 1️⃣ Clone Repository

git clone <YOUR_GITHUB_REPOSITORY_URL>
Example:
git clone https://github.com/YOUR_USERNAME/Student-Management-System.git

2️⃣ Go Inside Project
cd Student-Management-System
 3️⃣ Open In IDE

You can open the project using:
💻 Eclipse
💻 IntelliJ IDEA
💻 VS Code


## 4️⃣ Run Application
StudentManagementApp.java

# 📊 CRUD Operations

This project implements basic **CRUD** functionality.

        CRUD
         │
 ┌───────┼────────┐
 │       │        │
 ▼       ▼        ▼
Create  Read    Update
  │       │        │
 Add   Display   Update
         │
         ▼
       Delete
```

| CRUD      | Project Feature  |
| --------- | ---------------- |
| 🟢 Create | Add Student      |
| 🔵 Read   | Display / Search |
| 🟡 Update | Update Student   |
| 🔴 Delete | Delete Student   |

---

# 🎯 Learning Journey

This project connects Java concepts step-by-step:

```text
Variables
    ↓
Data Types
    ↓
Conditions
    ↓
Loops
    ↓
Methods
    ↓
Classes
    ↓
Objects
    ↓
Constructors
    ↓
Encapsulation
    ↓
Collections
    ↓
ArrayList
    ↓
Exception Handling
    ↓
Real-World Java Project 🚀
```

---

# 🔮 Future Enhancements

The project can be extended with advanced Java and backend technologies:

* [ ] 🔥 Custom Exceptions
* [ ] 🔥 Interfaces
* [ ] 🔥 Abstraction
* [ ] 🔥 HashMap
* [ ] 🔥 Sorting
* [ ] 🔥 Comparable
* [ ] 🔥 Comparator
* [ ] 🔥 Java 8 Streams
* [ ] 🔥 Lambda Expressions
* [ ] 🔥 File Handling
* [ ] 🔥 Serialization
* [ ] 🔥 JDBC
* [ ] 🔥 MySQL Database
* [ ] 🔥 JUnit Testing
* [ ] 🚀 Spring Boot REST API
* [ ] 🚀 RESTful Web Services

---

# 📈 Future Architecture

The simple console application can eventually become:

```text
                🌐 Client
                   │
                   ▼
             REST API
                   │
                   ▼
          🚀 Spring Boot
                   │
        ┌──────────┼──────────┐
        ▼          ▼          ▼
   Controller   Service   Repository
        │          │          │
        └──────────┼──────────┘
                   ▼
               🗄️ MySQL
```

---

# 💡 Key Learning

> **The main goal of this project is not just to create a Student Management System.**

The goal is to understand **how individual Java concepts work together to build a complete application.**

```text
Java Basics
     +
OOPs
     +
Collections
     +
Exception Handling
     ↓
Real-World Application 🚀
```


# 👨‍💻 Author
 
## Rahul Kumar Ujjawal Sharma
**Java Developer | Core Java | OOPs | Collections | Spring Boot**
📚 Currently strengthening Java fundamentals through practical projects.

# ⭐ Support
If you found this project useful for learning Core Java:
⭐ **Star this repository**
🍴 **Fork this repository**
📢 **Share it with other Java learners**

<p align="center">

 ### 🚀 Keep Learning • Keep Coding • Keep Building 🚀

**Made with ❤️ using Java**

</p>


 
