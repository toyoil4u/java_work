package java04.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-03.
 */

public class ex04_13_for실습예제 {

    public static void main(String[] args){

        int multi, dan;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("몇단? : ");
        dan = keyboard.nextInt();

        for ( int i = 1 ; i <= 9 ; i++ ){

            multi = dan * i;
            System.out.println(dan+" * "+i+" = "+multi);

        }



    }
}
