package java07;

import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-07.
 */

public class jv07_03_반평균구하기 {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int num = kb.nextInt();

        int[] student = new int[num];

        score( num, student );
        int sum = sum( num, student );
        System.out.println("\n합계는 : "+sum);
        System.out.println("평균은 : "+avg( num, sum ));
    }

    public static int[] score( int x, int[] y ){
        for ( int i = 0 ; i < x ; i++ ){
            System.out.print("성적을 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            y[i] = sc.nextInt();
        }
        return y;
    }

    public static int sum( int x, int[] y  ){
        int sum = 0;
        for ( int i = 0 ; i < x ; i++ ){
            sum += y[i];
        }
        return sum;
    }

    public static int avg( int x, int y  ){
        int avg = y/x;
        return avg;
    }
}
