package java03.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-03-31.
 */

public class ex03_02 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Score : ");
        int score = keyboard.nextInt();

        if (score >= 90){
            System.out.println("학점 : A");
        }
        else if (score >= 80){
            System.out.println("학점 : B");
        }
        else if (score >= 70){
            System.out.println("학점 : C");
        }
        else if (score >= 60){
            System.out.println("학점 : D");
        }
        else {
            System.out.println("학점 : F");
        }
    }

}
