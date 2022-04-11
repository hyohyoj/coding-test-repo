package coding.test.kakao;

import java.util.ArrayList;

public class Solution2 {
    public int solution2(int[][] board, int[] moves) {
        int answer = 0;
        
        ArrayList<Integer> basket = new ArrayList<Integer>();
        
        //1 -> board[0][0], [1][0], [2][0] ... 탐색
        //5 -> board[0][4], [1][4], [2][4] ... 탐색
        //for(i = 0; i < moves.length; i++) {
        //		if(board[i][moves[i]-1] != 0) {
        //			바구니 += board[i][moves-1];
        //			board[i][moves-1] = 0;
        //		}
        //}
        
        for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					//바구니에 추가
					basket.add(board[j][moves[i]-1]);
					//보드에서 제거
					board[j][moves[i]-1] = 0;
					//바구니에 연속 두개 같은 숫자인지 체크
					if(basket.size() > 1) {
						if(basket.get(basket.size()-2) == basket.get(basket.size()-1)) {
							basket.remove(basket.size()-1);
							basket.remove(basket.size()-1);
							answer += 2;
						}
					}
					break;
				}
			}
		}
        
        System.out.println(basket);
        
        return answer;
    }
}


