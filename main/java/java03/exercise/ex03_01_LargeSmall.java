package java03.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-03-31.
 */

public class ex03_01_LargeSmall {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();

        if (n >= 100){
            System.out.print("large");
        }
        else {
            System.out.print("small");
        }
    }


}
