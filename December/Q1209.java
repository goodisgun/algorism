package December;

public class Q1209 {
    class Solution {
        public String[] solution(String[] quiz) {
            String[] answer = new String[quiz.length];
            for (int i = 0; i < quiz.length; i++) {
                String [] tokens = quiz[i].split("");
                int num1 = Integer.parseInt(tokens[0]);
                int num2 = Integer.parseInt(tokens[2]);
                int expect = Integer.parseInt(tokens[4]);
                int result = 0;
                switch(tokens[1])
                {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                }
                if(result == expect)
                    answer[i] = "O";
                else
                    answer[i] = "X";
            }
            return answer;
        }
    }
}
