package java07;

import java.util.Scanner;

public class jv07_01_배열 {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("배열크기 입력 : ");
        int size = keyboard.nextInt();

        int [] array = new int[size];

        for (int i = 0 ; i < size ; i++ ) {
            array[i] = i;
        }

        for (int j = 0 ; j < array.length ; j++ ) {
            System.out.println(array[j]);
        }

    }

}
