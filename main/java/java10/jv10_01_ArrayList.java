package java10;

import java.util.*;

public class jv10_01_ArrayList {
    
    public static void main(String[] args) {
        
        int pos=0;
        String value = "";
        List<String> list = null;

        list = new ArrayList<String>(); //String [] arr = new String[10];        
        //list = new LinkedList<String>();
        //list = new Stack<String>();
        //list = new Vector<String>();
                
        /* C: 추가. 검색: "자바 arraylist 추가"
         * MILK, BREAD, BUTTER 순으로 추가
         * */
        list.add("Milk");
        list.add("Bread");
        list.add("Butter");
        System.out.println("C: 추가 >> " + list.toString());
        
        /* APPLE 삽입. 검색: "자바 arraylist 삽입"
         * 특정 위치에 추가하기
         * "BREAD" 앞에 "APPLE" 삽입
         * "BREAD" 가 들어있는 방번호 찾기
         * */
        pos = list.indexOf("Bread");
        list.add( pos, "Apple" );
        System.out.println("C: BREAD 앞에 APPLE 삽입 >> " + list.toString());
        
        /* R: 읽기 
         * BREAD 값을 출력하시오.
         * "BUTTER" 가 들어있는 방번호 찾기
         * */
        pos = list.indexOf("Butter");
        value = list.get(pos);
        System.out.println( "R: 읽기 >> " + value );
        
        /* U: 수정. 검색: "자바 arraylist 수정"
         * "BREAD" 를 "GRAPE"로 변경
         * "BREAD" 가 들어있는 방번호 찾기
         * */
        pos = list.indexOf("Bread");
        list.set( pos, "Graph");
        System.out.println("U: BREAD 를 GRAPE로 수정 >> " + list.toString());


        /* D: 인데스로 삭제. 검색: "자바 arraylist 삭제"
         * 인덱스스를 이용하여 BUTTER 를 삭제
         * */
        pos = list.indexOf("Butter");
        list.remove( pos );
        System.out.println("D: BUTTER 를 삭제 >> " + list.toString());

        /* D: 값으로 찾아서 삭제. 검색: "자바 arraylist 값으로 삭제"
         * 값으로 MILK를 찾아서 삭제하시오
         * */
        list.remove("Milk");
        System.out.println("D: 값으로 MILK를 찾아서 삭제 >> " + list.toString());


        
        
        /* P: for문으로 arraylist 값을 출력하기. 
         * 검색: "자바 arraylist for 출력"
         * 검색: "자바 arraylist 크기"
         * */
        for( int i = 0 ; i < list.size() ; i++ ){
            System.out.println( list.get(i) );
        }
        
        

        // 테스트용 데이터 생성을 위한 코드.
        for(int i=0; i<4; i++) {
            list.add("Apple");
            list.add("Banana");
        }
        System.out.println("테스트 >> " + list.toString());
        
        /*
         * S: 검색: "자바 ArrayList 검색
         */
        System.out.println( list.contains("Apple") );
        System.out.println( list.indexOf("Apple") );
        /*
         * S: 오름차순 정렬. 검색: "자바 ArrayList 오름차순 정렬"
         */
        Collections.sort(list);
        System.out.println( "오름 정렬 후 >>" + list.toString() );

        /*
         * S: 내림차순 정렬. 검색: "자바 ArrayList 내림차순 정렬"
         */
        Collections.reverse(list);
        System.out.println( "내림 정렬 후 >>" + list.toString() );
        /*
         * 검색2. apple 이 몇개 있나요?
         */
        int count = 0;
        for ( int i = 0 ; i < list.size() ; i++ ){
            if ( list.get(i).equals("Apple")) count++;
        }
        System.out.println("Apple의 갯수 >> "+count );

        /* ArrayList 배열로 변환.  toArray() 사용
         * "자바 ArrayList 배열 변환 검색"
         * */
        String[] str = new String[list.size()];
        str = (String[])list.toArray(str);

        /*
         *  변환 결과를 for 문으로 출력.
         */
        System.out.print("배열로 변환 >> ");
        for ( int i = 0 ; i < str.length ; i++ ){
            System.out.print( str[i]+" ");
        }
        System.out.println();
        /*
         *  변환 결과를 for each 문으로 출력.
         */
        System.out.print("배열로 변환(each) >> ");
        for ( String str1 : str ){
            System.out.print( str1 + " ");
        }
        System.out.println();

        // list 삭제 (for문 이용)
        System.out.println( "테스트  >>" + list.toString() );
        //for ( int j = list.size()-1 ; j >= 0  ; j-- ){
        //    list.remove(j);
        //    System.out.println( list.toString() );
        //}
        for ( int j = 0; j <= list.size()  ; ){
            list.remove(j);
            System.out.println( list.toString() );
        }

    }
}
