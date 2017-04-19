package java04.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-03.
 */

public class ex04_12_for실습예제 {

    public static void main(String[] args){

        int a, b, start, end;
        int sum = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("시작값을 입력하시오 : ");
        a = keyboard.nextInt();

        System.out.print("종료값을 입력하시오 : ");
        b = keyboard.nextInt();

        if ( a <= b ){
            start = a;
            end = b;
        }
        else {
            start = b;
            end = a;
        }

        for ( int i = start ; i <= end ; i++ ){
            sum += i;
        }

        System.out.println(start+"부터 "+end+"까지의 합계는 "+sum+"입니다");

    }


}
