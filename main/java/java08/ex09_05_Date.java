package java08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex09_05_Date {
    
    public static void main(String[] args) {

        // 현재 날짜와 시간 출력
        Date date = new Date();
        // 현재 연도만 출력
        System.out.println( date.getYear() );
        // 현재 월만 출력
        // 현재 일만 출력
        // 현재 시간만 출력
        // 현재 분만 출력
        // 현재 초만 출력
        // 현재에 +3년 출력
        date.setYear( date.getYear() + 3 );
        System.out.println(date);

        // 현재에 -4월 출력
        date.setMonth( date.getMonth() -4 );
        System.out.println(date);

        // 현재에 +2일 출력
        // 현재에 +4시간 출력
        // 현재에 -30분 출력
        // 현재에 + 10초 출력
        // 날짜만 yyyy-mm-dd 형태로 출력
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println( df1.format( date ));

        // 시간만 hh:mm:ss 형태로 출력
        SimpleDateFormat df2= new SimpleDateFormat("a hh:mm:ss");
        System.out.println( df2.format( date ));


    }
}
