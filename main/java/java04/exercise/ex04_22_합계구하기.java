package java04.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-04.
 */

public class ex04_22_합계구하기 {

    public static void main(String[] args){

        int sum = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("시작 정수를 입력하세요 : ");
        int start = keyboard.nextInt();

        System.out.print("마지막 정수를 입력하세요 : ");
        int end = keyboard.nextInt();

        for ( int i = start ; i <= end ; i = i+1 ){
            sum = sum + i;
            System.out.print(i);
            if ( i < end ) System.out.print(" + ");
        }
        System.out.println(" = "+sum);
    }
}
