package java04.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-03-31.
 */

public class ex04_12_구구단1 {


    public static void main(String[] args) {

        int start, end;

        Scanner keyboard = new Scanner(System.in);

        for (;true;){

            System.out.print("시작 단수를 입력하세요 : ");
            int a = keyboard.nextInt();

            System.out.print("종료 단수를 입력하세요 : ");
            int b = keyboard.nextInt();


            if ( a <= b ) {
                start = a;
                end = b;
            } else {
                start = b;
                end = a;
            }

            if ( start==0 ) break;

            for (int i = start; i <= end; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.format("%2d*%d=%3d",i,j,i*j);
                    if ( j < 9 ){
                        System.out.print(", ");
                    } else {
                        System.out.println(".");
                    }
                }
            }
            System.out.println();
        }
        System.out.print("\n 0단이 존재하지 않아 종료합니다");
    }
}

