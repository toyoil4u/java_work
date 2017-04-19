package java07.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-07.
 */

public class ex07_03_최대값최소값 {

    public static void main(String[] args) {

        int num = 5;

        int[] arr = new int[num];

        input( num, arr );
        output( "배열 정렬 전", arr );

        Arrays.sort( arr );
        output( "배열 정렬 후", arr );

        System.out.println("최소값 : "+arr[0]);
        System.out.println("최대값 : "+arr[num-1]);
    }

    public static int[] input( int x, int[] y ){
        Scanner sc = new Scanner(System.in);
        for ( int i = 0 ; i < x ; i++ ){
            System.out.print("input : ");
            y[i] = sc.nextInt();
        }
        return y;
    }

    public static void output( String str, int[] arr ){
        System.out.print(str+" : ");
        for ( int i = 0 ; i < arr.length ; i++ ){
            System.out.print( arr[i] );
            if( i < arr.length-1 ){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}


