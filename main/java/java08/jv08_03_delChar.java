package java08;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-12.
 */

public class jv08_03_delChar {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("변환할 문자열 : ");
        String src1 = kb.nextLine();
        System.out.print("제거할 문자열 : ");
        String src2 = kb.nextLine();

        src1 = delChar( src1, src2 );
        System.out.print("출력 : "+src1);
    }

    public static String delChar( String s1, String s2 ){
        for ( int i = 0 ; i < s2.length() ; i++ ){
            if ( s1.indexOf(s2.charAt(i)) > 0 )
                s1 = s1.replace( String.valueOf(s2.charAt(i)), "");
        }
        return s1;
    }
}
