package java03.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-03-31.
 */

public class ex03_02_MaxNumber_02 {

    public static void main(String[] args) {

        int max = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("첫번째 수를 입력하세요 : ");
        int a = keyboard.nextInt();

        System.out.print("두번째 수를 입력하세요 : ");
        int b = keyboard.nextInt();

        System.out.print("세번째 수를 입력하세요 : ");
        int c = keyboard.nextInt();


        if ( a >= c && b >= c ){
            if (a>=b){
                max = a;
            }
            else {
                max = b;
            }
        }
        else {
            max = c;
        }


        System.out.println("가장 큰 수는 : "+max);
    }


}
