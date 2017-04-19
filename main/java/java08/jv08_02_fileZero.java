package java08;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-12.
 */

public class jv08_02_fileZero {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("변환할 문자열 : ");
        String src = kb.nextLine();
        System.out.print("변환할 문자열의 길이 : ");
        int length = kb.nextInt();

        src = fileZero( src, length );
        System.out.print( "출력 : "+src );
    }

    public static String fileZero( String s, int x ){
        if ( x > 0 || s.equals(null) ){
            int leng = x - s.length();
            if ( leng < 0 ) s = s.substring(0, x);
            for ( int i = 0 ; i < leng ; i++ ){
                s = "0" + s;
            }
            return s;
        } else {
            return "";
        }

    }
}
