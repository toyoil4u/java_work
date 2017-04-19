package java04;

/**
 * Created by Administrator on 2017-04-04.
 */

public class jv04_04_구구단세로출력 {

    public static void main(String[] args){

        for ( int i = 2 ; i <= 19 ; i = i + 1){
            for ( int j = 1 ; j <= 9 ; j = j + 1){
                System.out.println( i + "*" + j + "=" + i*j );
            }
            System.out.println();
        }
    }
}
