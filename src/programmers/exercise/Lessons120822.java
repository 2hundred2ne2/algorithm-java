package programmers.exercise;

import java.sql.Array;
import java.util.*;

public class Lessons120821 {

    public static void main(String[] args){
        int[] test ={1,2,3,4,5};

        System.out.println(solution(test));
    }
        public static int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];
            for(int i =0;i <= answer.length-1 ;i++){
            answer[i] = num_list[answer.length-1-i];
            }
            return answer;
        }

}
