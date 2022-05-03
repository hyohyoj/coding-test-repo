
/* https://programmers.co.kr/learn/courses/30/lessons/81301 */
package coding.test.kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {

    public int solution(String s) {
        int answer = 0;
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int i = 0;
        
        //해시맵에 저장
        for (String string : arr) {
        	hm.put(string, i);
        	i++;
		}
        
        //문자열의 영어(key) 부분을 숫자(value)로 치환
        for (Entry<String, Integer> entry : hm.entrySet()) {
        	s = s.replace(entry.getKey(), Integer.toString(entry.getValue()));
		}
        
        //치환한 문자열을 int값으로 변환
        answer = Integer.parseInt(s);
        
        return answer;
    }  
}

//배열사용
//public int solution(String s) {
//    int answer = 0;
//    
//    String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//    
//    //자바에서는 배열에 indexOf()를 지원하지 않고, ArrayList 자료구조에서만 지원하므로 Arrays.asList()를 통해 변환시켜 인덱스를 구해야 함.
//    //System.out.println(Arrays.asList(arr).indexOf("two"));
//    
//    
//    for (String string : arr) {
//		s = s.replace(string, Integer.toString(Arrays.asList(arr).indexOf(string)));
//	}
//    
//    answer = Integer.parseInt(s);
//    
//    return answer;
//}

