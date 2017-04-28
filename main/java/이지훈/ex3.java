package 이지훈;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int start, end;
        for(;true;){
            System.out.print("시작단 : ");
            start = kb.nextInt();
            System.out.print("종료단 : ");
            end = kb.nextInt();
            if (start == 0 || end == 0) break;
            if (start > end) {
                int tmp = start;
                start = end;
                end = tmp;
            }
            gugudan(start, end);
        }
        System.out.println("구구단을 종료");
    }
    public static void gugudan(int x, int y){
        for (int i=x ; i<=y ; i++){
            for (int j=1 ; j<=9 ; j++){
                System.out.format("%d*%d=%2d",i,j,i*j);
                System.out.print((j<9)?", ":".\n");
            }
        }
    }
}
