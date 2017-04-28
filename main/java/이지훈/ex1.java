package 이지훈;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0 ; i < 2 ; i++){
            System.out.print("시작값을 입력하시오 : ");
            int start = scan.nextInt();
            System.out.print("종료값을 입력하시오 : ");
            int end = scan.nextInt();

            if (start > end){
                int tmp = start;
                start = end;
                end = tmp;
            }
            sumXY(start, end);
            System.out.println("\n");
        }
    }

    public static void sumXY(int x, int y) {
        int sum = 0;
        String str = "";
        for (int i = x; i <= y; i++){
            sum += i;
            str = str +((i== x)?"":" + ") + i;
        }
        System.out.println(str+" = "+sum);
    }

}
