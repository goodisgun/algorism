package December;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q1208 {
    class Solution {
        public long solution(String numbers) {
            String [] number = {"zero" , "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            long answer = 0;

            for (int i = 0; i<number.length; i++){
                if (numbers.contains(number[i])){
                    numbers = numbers.replaceAll(number[i], Integer.toString(i));
                }
            }

            return answer = Long.parseLong(numbers);           // # 1
        }
    }
}

/*#1 String 을 Long으로 교환하는 방법*/
