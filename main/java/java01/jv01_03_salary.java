package java01;

import java.util.Scanner;


public class jv01_03_salary {
 
    public static void main(String[] args) {
        int salary = 0;
        int deposit = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("월급을 입력하시오: ");

        salary = keyboard.nextInt();
        
        deposit = 10*12*salary;
        
        System.out.format("10년 동안의 저축액 : %d" ,deposit);
        keyboard.close();
        
    }
}
