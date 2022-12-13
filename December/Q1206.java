package December;

public class Q1206 {

    class Solution {
        public int[][] solution(int[] num_list, int n) {
            int a = num_list.length;
            int[][] array = new int[a/n][n];                          // #1
            for(int i =0; i < a; i++){
                array[i/n][i%n] = num_list[i];
            }
            return array;
        }
    }
}
