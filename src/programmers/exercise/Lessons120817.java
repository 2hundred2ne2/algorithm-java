package programmers.exercise;

import java.util.Arrays;

/*
        programmers
        level: 0
        title: 배열의 평균값 구하기
        url: https://school.programmers.co.kr/learn/courses/30/lessons/120817
*/
public class Lessons120817 {
   public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       System.out.println(solution(numbers));
   }
    public static double solution(int[] numbers) {
        double answer = 0;
       answer = Arrays.stream(numbers).sum();
        return answer/numbers.length;

        //return Arrays.stream(numbers).average().orElse(0);
        //.orElse(0) -> 주어진 값이 null이 아닌 경우 주어진 값을 되돌려주고 null인 경우 인수(0)을 돌려줌
        //List에서 필터처리할때 stream많이 써서 꼭 익혀야하는 코드라고 생각합니다.
   }
    public double solution2(int[] numbers) {
        double answer = 0;

        int sum = 0;
        for(int i: numbers){
            sum+=i;
        }
        answer = sum/(double)numbers.length;
        return answer;
    }
    public double solution3(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        answer /= numbers.length;
        return answer;
    }
}
