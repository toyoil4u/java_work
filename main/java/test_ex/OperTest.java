package test_ex;

import java.util.Scanner;

public class OperTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Oper oper = new Oper();
        System.out.print("First num : ");
        oper.setX(scan.nextInt());
        System.out.print("Second num : ");
        oper.setY(scan.nextInt());
        System.out.println("Add : "+oper.Add());
        System.out.println("Minus : "+oper.Minus());
        System.out.println("Mul : "+oper.Mul());
        System.out.format("Div : %.6f",oper.Div());
    }
}
