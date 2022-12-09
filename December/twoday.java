package December;

// 나머지가 0 = 배수로 판단할 수 있다.
// 향상된 for문을 사용하여 num변수를 추출하면 numlist값이 순서대로 출력된다 * 단 if문 통과시에
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int num : numlist){
            if (num % n ==0){
                answer.add(num);
            }
        }
        return answer;
    }
}
