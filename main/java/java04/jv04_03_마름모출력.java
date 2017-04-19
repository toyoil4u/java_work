package java04;

/**
 * Created by Administrator on 2017-04-04.
 */

public class jv04_03_마름모출력 {

    public static void main(String[] args){

        int cross = 99;
        int height = (cross-1)/2;

        for ( int i = 1 ; i <= height+1 ; i = i+1 ){
            for ( int j = 1 ; j <= i+height ; j = j+1 ) {
                if ( j <= height+1-i ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for ( int i = 1 ; i <= height ; i = i+1 ){
            for ( int j = 1 ; j <= cross-i ; j = j+1 ) {
                if ( j <= i ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

