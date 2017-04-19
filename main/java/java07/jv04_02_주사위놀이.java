package java07;

/**
 * Created by Administrator on 2017-04-11.
 */

public class jv04_02_주사위놀이 {

    public static void main(String[] args){

        int sum = 10;

        for( int i = 1 ; i <= 6 ; i++ ){
            for ( int j = 1 ; j <= 6 ; j++ ){
                if ( i + j == sum && i <= j ){
                    System.out.print("("+i+","+j+") ");
                }
            }
        }
    }

}
