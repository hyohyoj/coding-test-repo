/* https://programmers.co.kr/learn/courses/30/lessons/1845 */
package _8;

import java.util.ArrayList;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int pick = nums.length / 2;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i : nums) {
			if(!arr.contains(i)) {
				arr.add(i);
			}
		}
        
        if(arr.size() > pick) {
        	answer = pick;
        } else {
        	answer = arr.size();
        }
        
        
        return answer;
    }
}
