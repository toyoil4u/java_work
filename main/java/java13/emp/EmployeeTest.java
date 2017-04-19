package java13.emp;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0 ; i < employees.length ; i++){
            employees[i] = new Employee();
            System.out.println(i+1 +"번 사원 -------------");
            System.out.print("이름 : ");
            employees[i].setName(kb.next());
            System.out.print("주소 : ");
            employees[i].setAddress(kb.next());
            System.out.print("급여 : ");
            employees[i].setSalary(kb.nextInt());
            System.out.print("주민번호 : ");
            employees[i].setRrn(kb.next());
        }
        System.out.println("\n이름   주소   급여    주민번호");
        System.out.println("==============================");
        for (int j = 0 ; j < employees.length ; j++){
            System.out.println(employees[j].toString());
        }
    }
}
