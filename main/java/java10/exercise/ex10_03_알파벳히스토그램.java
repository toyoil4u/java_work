package java10.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-04-17.
 */

public class ex10_03_알파벳히스토그램 {
    public static void main(String[] args) {

        String news = "This was a great help. I applied this method to similiar problem and rather than concat a SELECT statement I created an event scheduled every couple hours to rebuild a view that pivots n amount of rows from one table into n columns on the other. It's a big help because before I was rebuilding the query using PHP on every execution of the SELECT. Even though views can't leverage Indexes, I'm thinking filtering performance won't be an issue as the pivoted rows->columns represent types of training employees at a franchise have so the view won't ever break a few thousand rows.";

        Map<String, String> map = new HashMap<String, String>();
        String values = "*";

        map.put("A","");
        map.put("B","");
        map.put("C","");
        map.put("D","");
        map.put("E","");
        map.put("F","");
        map.put("G","");
        map.put("H","");
        map.put("I","");
        map.put("J","");
        map.put("K","");
        map.put("L","");
        map.put("M","");
        map.put("N","");
        map.put("O","");
        map.put("P","");
        map.put("Q","");
        map.put("R","");
        map.put("S","");
        map.put("T","");
        map.put("U","");
        map.put("V","");
        map.put("W","");
        map.put("X","");
        map.put("Y","");
        map.put("Z","");

        for (int i=0 ; i<news.length() ; i++){
            String ch = news.substring(i, i+1).toUpperCase();
            if (map.containsKey(ch)) map.put(ch, map.get(ch)+values);
        }
        for (String key : map.keySet()) {
            System.out.println(key+" "+map.get(key)+" "+map.get(key).length());
        }
    }
}
