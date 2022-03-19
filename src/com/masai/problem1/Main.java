package com.masai.problem1;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Employee> employees = new TreeSet<>(new sortSalary());
        System.out.println("Do you want to add an employee? Y/N");

        while(true) {
            try {
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("N")) {
                    break;
                } else if (!response.equalsIgnoreCase("Y")) {
                    continue;
                } else {
                }

                System.out.println("Enter name: ");
                String name = scanner.next();

                System.out.println("Enter ID: ");
                int id = scanner.nextInt();

                System.out.println("Enter salary: ");
                double salary = scanner.nextDouble();

                employees.add(new Employee(name, id, salary));
                System.out.println("Do you want to add an employee? Y/N");
            } catch (InputMismatchException error) {
                System.out.println("Invalid ID/Salary");
                System.out.println("Do you want to add an employee? Y/N");
                continue;
            }
        }

        //Printing the employees
        for(Employee emp: employees) {
            System.out.println("Name: " + emp.getEmpName());
            System.out.println("ID: " + emp.getEmpId());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("_________________________________");
        }
    }
}
