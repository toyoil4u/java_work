package java07.exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017-04-07.
 */

public class ex07_05_유효점수 {

    public static void main(String[] args) {

        double average = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("심사위원 수 입력 : ");
        int num = keyboard.nextInt();

        int[] arr = new int[num];

        input(keyboard, arr);
        avail(arr);
        int sum = sum(arr);
        average = (double)sum/(arr.length-2);

        System.out.println("\n총점은 : "+sum);
        System.out.format("평균은 : %.2f", average);
    }


    public static int[] input(Scanner keyboard, int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(i+1 +"번 심사위원 : ");
            arr[i] = keyboard.nextInt();
        }
        return arr;
    }

    public static int[] avail( int[] arr ) {

        Arrays.sort(arr);

        arr[0] = 0;
        arr[arr.length-1] = 0;

        System.out.print("\n유효점수 : ");
        for (int i = 1 ; i < arr.length-1 ; i++) {
            System.out.print( arr[i]+" " );
        }
        return arr;
    }

    public static int sum ( int[] arr ){
        int sum = 0;
        for ( int i = 0 ; i < arr.length ; i++ ){
            sum += arr[i];
        }
        return sum;
    }
}
