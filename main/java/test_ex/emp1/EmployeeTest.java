package test_ex.emp1;

import java.util.Scanner;

import test_ex.emp1.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        for (int i=0 ; i<3 ; i++){
            employees[i] = new Employee();
            System.out.println(i+1+"번 사원 ---------");
            System.out.print("name : ");
            employees[i].setName(scan.nextLine());
            System.out.print("address : ");
            employees[i].setAddress(scan.nextLine());
            System.out.print("salary : ");
            employees[i].setSalary(scan.nextInt());
            scan.nextLine();
            System.out.print("rrn : ");
            employees[i].setRrn(scan.nextLine());
        }
        for (Employee str : employees){
            System.out.println(str.toString());
        }
    }
}
