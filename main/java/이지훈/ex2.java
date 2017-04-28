package 이지훈;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {

        int[] arr = {23, 96, 35, 42, 81, 19, 8, 77, 50};

        printArr("정렬전", arr);
        Arrays.sort(arr);
        printArr("\n정렬후", arr);
    }

    public static void printArr(String str, int[] array) {
        System.out.print(str + " : ");
        for (int i : array){
            System.out.print(i+" ");
        }
    }
}
