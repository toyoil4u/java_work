package java03.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-03-31.
 */

public class jv04_12_구구단 {


    public static void main(String[] args) {

        int start, end;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("시작 단을 입력하세요 : ");
        int a = keyboard.nextInt();

        System.out.print("종료 단을 입력하세요 : ");
        int b = keyboard.nextInt();

        if ( a <= b ) {
            start = a;
            end = b;
        }
        else {
            start = b;
            end = a;
        }

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
            System.out.println();
        }


    }
}
