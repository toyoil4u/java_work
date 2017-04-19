package java04.exercise;

/**
 * Created by Administrator on 2017-04-03.
 */

public class ex04_21_중첩for실습 {

    public static void main(String[] args){

        for ( int i = 1 ; i <= 5 ; i++ ){
            for ( int j = 1 ; j <= 5 ; j++ ){
                System.out.print("["+i+","+j+"]");
            }
            System.out.println();
        }
        System.out.println();

        for ( int i = 1 ; i <= 5 ; i++ ){
            for ( int j = 1 ; j <= 5 ; j++ ){
                if ( i == j ){
                    System.out.print("["+i+","+j+"]");
                }
                else {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }
}
