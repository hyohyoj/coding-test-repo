/* https://programmers.co.kr/learn/courses/30/lessons/67256 */
package _7;

public class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left_curr_num = 10;
        int right_curr_num = 12;
        
        int left_distance = 0;
        int right_distance = 0;
        
        // 1 2 3
        // 4 5 6
        // 7 8 9
        // * 0 #
        
        // [0,0] [0,1] [0,2]
        // [1,0] [1,1] [1,2]
        // [2,0] [2,1] [2,2]
        // [3,0] [3,1] [3,2]
        
        for (int i : numbers) {
        	switch (i) {
	        	case 1:
	        	case 4:
	        	case 7:
	        		answer += "L";
					left_curr_num = i;
					break;
	        	case 3:
	        	case 6:
	        	case 9:
	        		answer += "R";
					right_curr_num = i;
					break;
	        	default:
	        		if(i == 0) {
	        			i = 11;
	        		}
	        		
	        		// x좌표 + y좌표
	        		left_distance = Math.abs(((left_curr_num - 1) / 3) - i / 3) + Math.abs(((left_curr_num - 1) % 3) - 1);
	        		right_distance = Math.abs(((right_curr_num - 1) / 3) - i / 3) + Math.abs(((right_curr_num - 1) % 3) - 1);
	        		
	        		if(left_distance == right_distance) {
	        			if(hand.equals("right")) {
	        				answer += "R";
	    					right_curr_num = i;
	    					break;
	        			} else {
	        				answer += "L";
	    					left_curr_num = i;
	    					break;
	        			}
	        		} else if (left_distance > right_distance) {
	        			answer += "R";
    					right_curr_num = i;
    					break;
	        		} else {
	        			answer += "L";
    					left_curr_num = i;
    					break;
	        		}	
        	}
		}

        return answer;
    }
}


