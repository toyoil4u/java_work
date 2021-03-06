package java10;

import java.util.*;

public class jv10_03_HashMap {
    public static void main(String[] args) {
        
        String values = "";
        Map<String, String> map = null;
        
        map = new HashMap<String, String>();
        //map = new Hashtable<String, String>();
        //map = new TreeMap<String, String>();

        /* C: 추가. 검색: "자바 HashMap 추가"
         *
         * 송중기
         * 이광수
         * 송혜교
         * */
        map.put("c01", "송중기");
        map.put("c02", "이광수");
        map.put("c03", "송혜교");

        System.out.println(" C: 추가 >> " + map.toString()); // 모든 항목을 출력한다.        
        
        /* C: 삽입. 검색: "자바 HashMap 삽입" = 대체됨
         *
         * 유재석 삽입 되나 안되나? X
         * */
        map.put("c02", "유재석");

        System.out.println(map.toString()); // 모든 항목을 출력한다.  

        /* R: 읽기
         *
         * 송혜교만  출력
         * */
        values = map.get("c03");

        System.out.println( map.get("c03")/* 송혜고만 출력 */ );

        /* U: 수정.변경. 검색: "자바 HashMap 수정"
         *
         * 유재석을 하하로 변경
         * */
        map.put("c02","하하");

        System.out.println(map.toString());
        
        /* D: 키 값으로 삭제. 검색: "자바 HashMap 삭제"
         *
         * 송혜교를 삭제
         * */
        map.remove("c03");

        System.out.println(map.toString());

        
        // for문으로 Map 출력하기. 방법1
        // iterator()를 이용하는 방식은 루프안에서 map 데이터를 삭제할때 사용.
        // http://stove99.tistory.com/96        

        Iterator<String> keys = map.keySet().iterator();
        for (;keys.hasNext();){
            String key = keys.next();
            System.out.println(key+" "+map.get(key));
        }


        // foreach문으로 Map 출력하기. 방법2
        // keySet() 보다 빠르다.
        // http://stove99.tistory.com/96

        for (String key : map.keySet()) {
            System.out.println(key+" "+map.get(key));            
        }
        
        // foreach문으로 Map 출력하기. 방법3
        // http://stove99.tistory.com/96

        for (Map.Entry<String, String> elem : map.entrySet()) {
            System.out.println(elem.getKey()+"  "+elem.getValue());
        }
        
        // S: HashMap 오름차순 정렬. 검색: "자바 HashMap 오름차순 정렬"
        // http://huskdoll.tistory.com/5/
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.putAll(map);

        Iterator<String> treeMapIter = treeMap.keySet().iterator();
        for( ; treeMapIter.hasNext(); ) {

            String key = treeMapIter.next();
            String value = treeMap.get( key );

            System.out.println(key+" : "+value);
        }



        // S: HashMap 내림차순 정렬. 검색: "자바 HashMap 내림차순 정렬"
        // http://huskdoll.tistory.com/5
        TreeMap<String, String> treeMapReverse = new TreeMap<String, String>(Collections.reverseOrder());
        treeMapReverse.putAll(map);
 
        Iterator<String> treeMapReverseIter = treeMapReverse.keySet().iterator();
         for( ; treeMapReverseIter.hasNext(); ) {
 
            String key = treeMapReverseIter.next();
            String value = treeMapReverse.get( key );
 
            System.out.println(key+" : "+value);
        }        

        // S: HashMap 검색. "자바 HashMap 검색"  
        // S: 키로 검색 containsKey() 사용


         
        // S: 값으로 검색 containsValue() 사용
    }    
}
