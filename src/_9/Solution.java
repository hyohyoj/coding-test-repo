/* https://programmers.co.kr/learn/courses/30/lessons/77884 */
package _9;

import java.util.ArrayList;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i = left; i <= right; i++) {
        	arr.clear();
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					if(!arr.contains(i)) {
						arr.add(i);
					}
					if (!arr.contains(j)) {
						arr.add(j);
					}
				}
			}
			
//			if(arr.size() % 2 == 0) {
//				answer += i;
//			} else {
//				answer -= i;
//			}
			
			answer = (arr.size() % 2 == 0) ? answer + i : answer - i;
		}
        
        return answer;
    }
}
