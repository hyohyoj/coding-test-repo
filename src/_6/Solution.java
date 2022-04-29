package _6;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int num = 0;
        
        Arrays.sort(d);
        
        for (int i : d) {
        	num += i;
			if(num <= budget) {
				answer++;
			} else {
				break;
			}
		}
        
        return answer;
    }
}

