package December;

public class Threeday {

}

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int col = board[1];                    //#0
        int row = board[0];

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left") && answer[0] - 1 >= -(row / 2)) {
                answer[0] = answer[0] - 1;
            } else if (keyinput[i].equals("right") && answer[0] + 1 <= (row / 2)) {
                answer[0] = answer[0] + 1;
            } else if (keyinput[i].equals("down") && answer[1] - 1 >= -(col / 2)) {
                answer[1] = answer[1] - 1;
            } else if (keyinput[i].equals("up") && answer[1] + 1 <= (col / 2)) {
                answer[1] = answer[1] + 1;
            }
        }
            return answer;
        }
    }

// #0 각각의 인덱스 값이 달라야  answer값을 다르게 설정할 수 있다.
