package java08.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-12.
 */

public class ex08_03_문자열비교 {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("20자 내외의 문자를 입력하세요 : ");
        String str1 = kb.next();
        System.out.print("20자 내외의 문자를 입력하세요 : ");
        String str2 = kb.next();

        if ( str1.equals(str2) ){
            System.out.println("같은 문자열");
        } else {
            System.out.println("다른 문자열");
        }

    }
}
