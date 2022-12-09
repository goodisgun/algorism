package December;

public class oneday {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            if (n % 7 ==0){
                answer = n / 7;
            } else if(n % 7 !=0){
                answer = n / 7 + 1;
            } return answer;
        }
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        if (n <= 7  ) {
            answer = 1;
        } else if (8 <= n && n < 15){
            answer = 2;
        }else if (15 <= n & n < 22){
            answer = 3;
        } return answer;

    }
}


