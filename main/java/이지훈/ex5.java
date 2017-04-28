package 이지훈;

import java.util.Map;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        for (int i=0 ; i<3 ; i++){
            employees[i] = new Employee();
            System.out.println(i+1+"번 사원 ---------");
            System.out.print("이름 : ");
            employees[i].setName(scan.nextLine());
            System.out.print("주소 : ");
            employees[i].setAddress(scan.nextLine());
            System.out.print("급여 : ");
            employees[i].setSalary(scan.nextInt());
            scan.nextLine();
            System.out.print("주민번호 : ");
            employees[i].setRrn(scan.nextLine());
        }
        for (Employee str : employees){
            System.out.println(str.toString());
        }
    }
}
