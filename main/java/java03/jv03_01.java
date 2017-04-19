package java03;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-03-31.
 */

public class jv03_01 {

    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        System.out.print("성적을 입력하세요");

        int grade = key.nextInt();

        if( grade >= 60){
            System.out.print("합격입니다\n");
            System.out.print("장학금을 받을 수도 있습니다");
        }
        else {
            System.out.print("불합격입니다");
        }
    }
}
