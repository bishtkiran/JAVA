package com.practice;

class Employee{
    int employeeId;
    double salary;           //non-static
    static String ceo;      //static which is same for all objects

    static {               //static Block for initialization of static members
        System.out.println("Inside static Block2");
    }
    static {               //static Block for initialization of static members
        System.out.println("Inside static Block1");
        ceo = "Navin";
    }

    Employee(int employeeId, double salary){
        this.employeeId = employeeId;
        this.salary = salary;
        System.out.println("Inside Constructor");
    }



    public void printEmployeeDetails(){
        System.out.println("EmployeeId = " + employeeId);
        System.out.println("Salary = " + salary);
        System.out.println("CEO = " + ceo);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, 30000);
        Employee employee2 = new Employee(102,40000);

        employee1.printEmployeeDetails();
        System.out.println("----------------");
        employee2.printEmployeeDetails();


    }
}
