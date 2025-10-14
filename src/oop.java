 import java.util.Scanner;

public class oop {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Jeremy";
        emp1.salary = 100;
        emp1.age= 32;

        foo(emp1);

    }

    public static void foo(Employee emp){
        System.out.println(emp.name + "is "+ emp.age + " years old and earns Ksh: " + emp.salary );
    }

    public static class Employee {
        public String name;
        public double salary;
        int age ;
//        public Employee(String name, double salary, int age) {}
    }

}



