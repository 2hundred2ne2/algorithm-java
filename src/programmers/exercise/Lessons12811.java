package programmers.exercise;

import java.util.Arrays;

/*
        programmers
        level: 0
        title: 중앙값 구하기
        url: https://school.programmers.co.kr/learn/courses/30/lessons/120811
*/
public class Lessons12811 {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];
        return answer;
    }
}
