package java04.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-04.
 */

public class ex03_10_대문자를소문자로 {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.print("영문을 입력하세요 : ");

        String str = keyboard.next();
        String str2="";

        for ( int i = 0 ; i < str.length() ; i++ ){

            char ch = str.charAt(i);

            if ( 65 <= ch && ch < 97  ){
               ch = lowerCase(ch);
            } else {
               ch = upperCase(ch);
            }
            str2 = str2 + ch;
        }
        System.out.println("입력 문자열 : "+str);
        System.out.println("출력 문자열 : "+str2);

    }

    private static char lowerCase(char ch) {
        char result = (char)(ch + 32);
        return result;
    }

    private static char upperCase(char ch) {
        char result = (char)(ch - 32);
        return result;
    }
}
