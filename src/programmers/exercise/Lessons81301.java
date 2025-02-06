package programmers.exercise;

import java.util.Arrays;

/*
        programmers
        level: 0
        title:숫자 문자열과 영단어

        url: https://school.programmers.co.kr/learn/courses/30/lessons/81301
*/
public class Lessons81301 {

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(solution("one4seveneight"));
    }

        public static int solution(String s) {
            int answer = 0;

            String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
            String changeText = s;

            for(int i = 0; i < num.length; i++){
                changeText = changeText.replaceAll(num[i], Integer.toString(i));

            }


            answer = Integer.parseInt(changeText);
            return answer;
        }
}
