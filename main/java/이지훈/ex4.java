package 이지훈;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Oper oper = new Oper();
        System.out.print("First num : ");
        oper.setX(scan.nextInt());
        System.out.print("Second num : ");
        oper.setY(scan.nextInt());
        System.out.println("Add : "+oper.add());
        System.out.println("Minus : "+oper.minus());
        System.out.println("Mul : "+oper.mul());
        System.out.format("Div : %.6f",oper.div());
    }
}
