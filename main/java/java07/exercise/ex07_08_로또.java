package java07.exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-10.
 */

public class ex07_08_로또 {

    public static void main(String[] args){

        int [] lotto = new int[6];
        int temp = 0;

        Scanner keyboard = new Scanner(System.in);

        for ( int i = 0 ; i < 6 ; i++ ){

            for(;true;){
                System.out.print(i+1+"번 로또번호 입력 : ");
                temp = keyboard.nextInt();

                if ( compare( lotto, temp ) ){
                    System.out.println("같은 숫자 있음");
                } else {
                    break;
                }
            }
            lotto[i] = temp;

        }
        Arrays.sort(lotto);

        System.out.print("입력된 로또번호 : ");
        for ( int i = 0 ; i < 6 ; i++ ){
            System.out.print(lotto[i]+" ");
        }
    }

    public static boolean compare(int[] lotto, int x){

        for ( int i = 0; i < lotto.length ; i++ ){
            if ( x == lotto[i] )
                return true;
        }
        return false;
    }

}

