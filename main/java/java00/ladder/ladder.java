package java00.ladder;

import java.util.Scanner;

public class ladder {
    public static void main(String[] args) {
        int[][] ladder = {
                {1, 0, 0, 1},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 0, 1},
                {0, 1, 0, 1}
        };

        System.out.println(
                "-------공포의 사다리-------\n\n" +
                "   1    2    3    4    5\n" +
                "   |    |    |    |    |\n" +
                "---------------------------\n" +
                "|                         |\n" +
                "|                         |\n" +
                "|                         |\n" +
                "|                         |\n" +
                "|                         |\n" +
                "---------------------------\n" +
                "   |    |    |    |    |\n" +
                "   A    B    C    D    E\n"
        );

        Scanner kb = new Scanner(System.in);
        String[] chair = chair(ladder[0].length, kb); // 자리결정
        System.out.println();

        String[] result = result(ladder[0].length, kb); // 벌칙결정
        System.out.println();

        System.out.println("------ 공포의 결과 ------");
        for (int i = 0 ; i < ladder[0].length+1 ; i++){
            int x = ladderLogic(i, ladder); // 사다리 로직
            System.out.println(chair[i] + " >> " + result[x]);
        }
    }

    public static int ladderLogic(int x, int[][] array) { // 사다리로직
        for (int y = 0; y < array.length ; y++){
            if (x > 0 && array[y][x-1] == 1) x--; // left check
            else if (x < array[0].length && array[y][x] == 1) x++; // right check
        }
        return x;
    }

    public static String[] chair(int x, Scanner kb) {  // 자리결정
        System.out.println("------ 자리 결정 ------");
        String[] chair = new String[x+1];
        for (int i = 0; i < x+1 ; i++){
            System.out.print(i+1+"번 자리 : ");
            chair[i] = kb.next();
        }
        return chair;
    }

    public static String[] result(int x, Scanner kb) {  // 벌칙결정
        System.out.println("------ 벌칙 결정 ------");
        String[] result = new String[x+1];
        for (int i = 0; i < x+1 ; i++){
            System.out.print((char)('A'+i)+"번 결과 : ");
            result[i] = kb.next();
        }
        return result;
    }
}
