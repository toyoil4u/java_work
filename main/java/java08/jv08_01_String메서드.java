package java08;

public class jv08_01_String메서드 {
    
    public static void main(String[] args) {
        
        // 0번째부터 12번째 자리까지 있음.
        // prov 크기는 13이다.
        String prov = "A barking Dog";
                
        // 문자열 길이: length() 
        
        // 문자열 추출 : substring()
        // (2번째부터 4번째 자리까지 추출:  bar)
       
        // 문자열 추출 : substring()
        // "A barking dog"에서 마지막 g 빼고 "A barking do" 를 출력하시오.  
            
        // 한개 문자 추출 
        // substring() --> 문자열 반환: 
        // charAt()    --> 문자   반환: 
       System.out.println(prov.substring(3,4));
        // 문자열 결합 : +
        
        // 빈 문자열 확인 : isEmpty()


        
        // 문자열 포함 여부 확인: contains()

        if ( prov.contains("bar") ) System.out.println("있음");

                
        // 문자열 치환 : replace()

        String s07 = prov.replace("Dog", "Cat");
        System.out.println(s07);

        
        // 문자열 치환 : replaceAll(). 정규표현식을 사용한 패턴 치환

        String s08 = "abc ab bcd";
        String s09 = s08.replaceAll("[ab]", " ");
        System.out.println(s09);

        String s09a = s08.replace("ab", " ");
        System.out.println(s09a);


        String s10 = s08.replaceAll("d$", "10");
        System.out.println(s10);
                
        // 문자열 자르기: split()은 배열로 돌려준다.
		// 지정한 문자로 문자열을 나눈다.(배열로 반환)
        
        String[] s11 = prov.split(" ");
        for ( String str : s11 ) {
            System.out.print(str+" ");
        }

        System.out.println();

        // 문자열 좌우 공백 제거 : trim()
        String s12 = prov.trim();
        System.out.println(s12);


        // String.format() 사용법
        // %s : 문자열
        // %d : 정수
        // %f : 부동소수점
        // %c : 문자한개
        // %tc: 날짜와 시간 전부 표시
        // %tr: 시간만 표시할때
        // %A %B %C 요일,월,일 표시        
                
        // 날짜 출력 포맷 지정 하기: SimpleDateFormat 클래스 사용
        
    }
    
}
