package java08;

import java.util.Calendar;

public class ex09_07_Calendar {
    
    public static void main(String[] args) {


        // 현재 날짜와 시간 출력
        Calendar today = Calendar.getInstance();
        System.out.println( today.getTime() );

        // 현재 연도만 출력
        System.out.println( today.get(Calendar.YEAR) );

        // 현재 월만 출력
        System.out.println( today.get(Calendar.MONTH)+1 );

        // 현재 일만 출력
        System.out.println( today.get(Calendar.DAY_OF_MONTH) );

        // 현재 시간만 출력
        System.out.println( today.get(Calendar.HOUR_OF_DAY));

        // 현재 분만 출력
        System.out.println( today.get(Calendar.MINUTE));

        // 현재 초만 출력
        System.out.println( today.get(Calendar.SECOND));

        // 현재에 +3년 출력
        today.add(Calendar.YEAR, 3);
        System.out.println( today.get(Calendar.YEAR));


        // 현재에 -4월 출력
        today.add(Calendar.MONTH, -4);
        System.out.println( today.get(Calendar.MONTH)+1 );


        // 현재에 +2일 출력
        today.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println( today.get(Calendar.DAY_OF_MONTH));

        // 현재에 +4시간 출력
        today.add(Calendar.HOUR_OF_DAY, 4);
        System.out.println( today.getTime());

        // 현재에 -30분 출력
        // 현재에 + 10초 출력
        // DateFormat 설정

    }
}
