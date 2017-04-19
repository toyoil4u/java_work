package java04.exercise;

/**
 * Created by Administrator on 2017-04-03.
 */

public class ex04_14_for실습 {

    public static void main(String[] args){

        for ( int i = 1 ; i <= 9 ; i++ ){

            System.out.print("2*"+i+"="+2*i);

            if ( i < 9 ){
                System.out.print(", ");
            }
            else {
                System.out.print(".");
            }

        }

    }


}
