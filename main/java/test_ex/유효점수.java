package test_ex;

import java.util.Arrays;
import java.util.Scanner;

public class 유효점수 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("심사위원수 : ");
        int panel = kb.nextInt();
        int[] score = new int[panel];
        System.out.print(panel+"명의 심사위원 점수 입력");
        for (int i=0 ; i<panel ; i++){
            System.out.print(i+1+"번 심사위원 점수 : ");
            score[i] = kb.nextInt();
        }
        Arrays.sort(score);
        String aScore = "";
        int sum = 0;
        for (int i=1 ; i<panel ; i++){
            aScore = ""+score[i]+" ";
            sum += score[i];
        }
        System.out.println("유효점수 : "+aScore);
        System.out.println("총점 : "+sum);
        System.out.format("평균 : %.2f",(double)sum/(panel-2));
    }
}
