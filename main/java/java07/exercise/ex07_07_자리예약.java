package java07.exercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-10.
 */

public class ex07_07_자리예약 {

    public static void main(String[] args){

        int [] seat = new int[10];
        int count = 0;
        Scanner keyboard = new Scanner(System.in);

        for (;true;){
            System.out.println();
            for ( int i = 1 ; i <= 10 ; i++ ){
                System.out.format("%3d", i);
            }
            System.out.println("\n----------------------------------");
            for ( int i = 0 ; i < 10 ; i++ ){
                if ( seat[i] != 1 ) seat[i] = 0;
                System.out.format("%3d", seat[i]);
            }

            System.out.print("\n\n원하시는 좌석번호를 입력하세요(종료는 -1) : ");
            int rSeat = keyboard.nextInt();
            if ( rSeat == -1 ) break;

            reserv(seat[rSeat - 1]);

            seat[rSeat-1] = 1;

        }
        System.out.println("\n종료합니다");
    }

    public static void reserv(int i) {
        if ( i == 1 ) {
            System.out.println("이미 예약된 좌석입니다");
        }
    }


}
