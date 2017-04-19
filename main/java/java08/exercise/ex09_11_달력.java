package java08.exercise;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-13.
 */

public class ex09_11_달력 {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("년도를 네자리로 입력하세요 (예: 2020) : ");
        int year = kb.nextInt();
        System.out.print("월을 입력하세요 (예: 6) : ");
        int month = kb.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set( Calendar.YEAR, year );
        cal.set( Calendar.MONTH, month-1 );
        cal.set( Calendar.DAY_OF_MONTH, 1 );

        int firstday = cal.get( Calendar.DAY_OF_WEEK );
        int lastday = cal.getActualMaximum( Calendar.DATE );

        System.out.print("=====================");
        System.out.format( "< %4d년 %2d월 >",year ,month );
        System.out.print("=====================\n");

        calPrint( firstday, lastday );
    }

    public static void calPrint( int x, int y ){
        String[] date = {"일", "월", "화", "수", "목", "금", "토"};
        String width = "       ";
        for ( int i = 0 ; i < 7 ; i++ ){
            System.out.print( date[i] );
            if ( i < 6 ) System.out.print(width);
        }
        System.out.println();
        for ( int j = 1  ; j <= y + x-1 ; j++ ){
            if ( j <= x-1 ){
                System.out.print("  "+width);
            } else {
                System.out.format("%2d"+width, j - (x-1) );
                if ( j%7 == 0 ) System.out.println();
            }
        }

    }

}
