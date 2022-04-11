package coding.test.hash._2;

import java.util.Arrays;

public class Solution {

    public boolean solution(String[] phone_book) {
    	//startsWith : 문자열이 지정된 문자로 시작하는지 여부를 확인하는 메서드
        //endsWith : 문자열이 지정된 문자로 끝나는지 여부를 확인하는 메서드
    	
        boolean answer = true;
        Arrays.sort(phone_book);	//오름차순 정렬
        
//        for (String string : phone_book) {
//			System.out.print(string + " ");
//		}
//        System.out.println("\n");
        
        for (int i = 0; i < phone_book.length - 1; i++) {
        	if(phone_book[i+1].startsWith(phone_book[i])) {
				answer = false;
				break;
        	}
		}
        
        return answer;
    }
}
