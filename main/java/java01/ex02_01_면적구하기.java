package java01;

import java.util.Scanner;


public class ex02_01_면적구하기 {
    // SLF4J Logging

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double w, h, area, perimeter;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("가로길이를 입력해 주세요 : ");
        w = scan.nextDouble();
        
        System.out.print("세로길이를 입력해 주세요 : ");
        h = scan.nextDouble();
              
        area = w*h;
        perimeter = 2*(w+h); 
        
        System.out.println();             
        System.out.println("사각형의 넓이 : " + area);
        System.out.println("사각형의 둘레 : " + perimeter);
        
        scan.close();

        h = 5;
        w = 10;
        
        System.out.println();             
        System.out.println("사각형의 넓이 : " + area);
        System.out.println("사각형의 둘레 : " + perimeter);

        
    }
}
