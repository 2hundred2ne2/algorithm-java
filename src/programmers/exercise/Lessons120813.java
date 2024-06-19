package programmers.exercise;
/*
programmers
        level: 0
        title: 짝수는 싫어요
        url: https://school.programmers.co.kr/learn/courses/30/lessons/120813
* */

public class Lessons120813 {
    public static void main(String[] args){

        int[] arr2 = solution(10);
        for (int i= 0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
    public static int[] solution(int n) {
        int[] answer = {};
        if (0 < n%2){
            answer = new int[n/2+1];
        }else{
            answer = new int[n/2];
        }



        for(int i = 1; i <= n; i++){
            if( 0 < i%2 ){
                answer[i/2] = i;
            }
        }
        return answer;
    }
}
