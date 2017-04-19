package java07.exercise;

import java.util.HashMap;
import java.util.Map;

public class ex07_07_2차원자리예약 {

    public static void main(String[] args) {

        int seat = 20;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1 ; i <= seat ; i++){
            double random = Math.random();
            int tmp = (int)(random*seat) + 1;
            if (map.containsValue(tmp)){
                i--;
                continue;
            }
            Integer randSeat = tmp;
            map.put(i, randSeat);
        }
        System.out.format(
                "                    |------------------|\n" +
                "                    |                  |\n" +
                "                    |------------------|\n" +
                "\n" +
                "|--------|--------|--------|    |--------|--------|--------|\n" +
                "|  %3d   |  %3d   |  %3d   |    |  %3d   |  %3d   |  %3d   |\n" +
                "|--------|--------|--------|    |--------|--------|--------|\n" +
                "|  %3d   |  %3d   |  %3d   |    |  %3d   |  %3d   |  %3d   |\n" +
                "|--------|--------|--------|    |--------|--------|--------|\n" +
                "         |  %3d   |  %3d   |    |  %3d   |  %3d   |  %3d   |\n" +
                "         |--------|--------|    |--------|--------|--------|\n" +
                "                                |  %3d   |  %3d   |  %3d   |\n" +
                "                                |--------|--------|--------|",
                map.get( 1), map.get( 2), map.get( 3), map.get( 4), map.get( 5),
                map.get( 6), map.get( 7), map.get( 8), map.get( 9), map.get(10),
                map.get(11), map.get(12), map.get(13), map.get(14), map.get(15),
                map.get(16), map.get(17), map.get(18), map.get(19), map.get(20) );
    }
}
