package java04;

/**
 * Created by Administrator on 2017-04-04.
 */

public class jv04_03_삼각형출력 {

    public static void main(String[] args){

        for ( int i = 1 ; i <= 9 ; i = i+1 ){
            for ( int j = 1 ; j <= i ; j = j+1 ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for ( int i = 9 ; i >= 1 ; i = i-1 ){
            for ( int j = 1 ; j <= i ; j = j+1 ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for ( int i = 9 ; i >= 1 ; i = i-1 ){
            for ( int j = 1 ; j <= 9 ; j = j+1 ) {
                if ( j <= 9-i ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        for ( int i = 1 ; i <= 5 ; i = i-1 ){
            for ( int j = 1 ; j <= i+4 ; j = j+1 ) {
                if ( j <= 5-i ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}

