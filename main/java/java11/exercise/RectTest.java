package java11.exercise;

import java.util.Scanner;

public class RectTest {

    public static void main(String[] args) {

        Rect rect = new Rect();
        Scanner kb = new Scanner(System.in);
        System.out.print("가로를 입력 : ");
        rect.setWidth(kb.nextInt());
        System.out.print("세로를 입력 : ");
        rect.setHeight(kb.nextInt());

        System.out.println("사각형의 넓이 : "+rect.area());
        System.out.println("사각형의 둘레 : "+rect.perimeter());
    }
}
