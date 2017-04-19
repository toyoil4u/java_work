package java04;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-04.
 */

public class jv04_07_무한루프 {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        for (;true;){
            System.out.print("정수를 입력하세요 : ");
            int x = keyboard.nextInt();
            if (x == -10){
                break;
            }
            System.out.format("입력한 값은 %d입니다,\n",x);
        }
        System.out.println("정상 종료입니다.");
    }
}
