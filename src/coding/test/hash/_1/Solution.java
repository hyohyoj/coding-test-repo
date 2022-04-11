package coding.test.hash._1;

import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        //Map : key, value 값으로 구성된 객체 저장
        //HashMap : 해싱(Hashing) 사용하기 때문에 많은 양의 데이터를 검색하는 데 뛰어난 성능 보임
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        for (String player : participant) {
        	//이전에 player가 해시맵에 없으면 0을 주고 있으면 player의 값을 가져와서 + 1
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
        System.out.println(hm);
        
        for (String player : completion) {
			hm.put(player, hm.get(player) - 1);
		}
        System.out.println(hm);
        
        //keySet() : key값만 받아서 get(key)로 value 출력 가능
        //entrySet() : key, value 모두 필요할 경우 사용
        for (Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getValue() != 0) {
				answer = entry.getKey();
			}
		}
        
        return answer;
    }
}
