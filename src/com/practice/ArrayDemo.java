package com.practice;

class Student{
    int rollNumber;
    String name;
    Student(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public void showDetails(){
        System.out.println("Roll Number = "+ rollNumber + " Name = "+ name);
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        Student [] students = new Student[5];
        students[0] = new Student(1, "John");
        students[1] = new Student(2,"David");
        students[2] = new Student(3,"Larry");
        students[3] = new Student(4,"Sam");
        students[4] = new Student(5,"Ben");

       for(Student student : students){
           student.showDetails();
       }
    }
}
