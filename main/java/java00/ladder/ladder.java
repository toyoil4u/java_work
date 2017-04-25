package java00.ladder;

public class ladder {
    public static void main(String[] args) {
        int[][] ladder = {
                {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 1, 0, 1}
        };
        int leg = 4;

        for (int y = 0 ; y < ladder.length ; y++){
            int x = leg;
            if (leg > 0 && ladder[y][x-1] == 1){ // left check
                leg = x - 1;
            } else if (leg < ladder[0].length && ladder[y][x] == 1){ // right check
                leg = x + 1;
            } else {
                leg = x;
            }
        }

        System.out.println(leg);
    }
}
