/* https://programmers.co.kr/learn/courses/30/lessons/42862 */
package _10;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
    	int answer = n - lost.length;
    	
    	Arrays.sort(lost);
        Arrays.sort(reserve);
    	
        ArrayList<String> rStudents = new ArrayList<String>();
        ArrayList<String> lStudents = new ArrayList<String>();
        ArrayList<String> remove = new ArrayList<String>();
        
        // ArrayList에 담기
        for (Integer i : lost) {
			lStudents.add(i.toString());
		}
        for (Integer i : reserve) {
			rStudents.add(i.toString());
		}
        
        // 여벌 있는데 도둑 맞은 친구 제외
        for (String string : rStudents) {
			if(lStudents.contains(string)) {
				remove.add(string);
			}
		}
        for (String string : remove) {
			rStudents.remove(string);
			lStudents.remove(string);
			answer++;
		}
        
        // 체육복 빌려주기
        for (String i : lStudents) {
        	if(rStudents.contains(Integer.toString(Integer.parseInt(i) - 1))) {
				rStudents.remove(Integer.toString(Integer.parseInt(i) - 1));
				answer++;
			} else if (rStudents.contains(Integer.toString(Integer.parseInt(i) + 1))) {
				rStudents.remove(Integer.toString(Integer.parseInt(i) + 1));
				answer++;
			}
		} 
        
        return answer;
    }
}
