package programmers.exercise;
/*
programmers
        level: 0
        title: 피자나눠먹기
        url: https://school.programmers.co.kr/learn/courses/30/lessons/120815
        // 최대 공약수 ,최대 공배수로 구해보기

* */

public class Lessons120815 {
    public static void main(String[] args){
        System.out.println(solution(100));
    }
    public static int solution(int n) {
        int answer = 0;
        //피자 낱개 수
        int piece = 6 ;
        //피자 판 수
        int pizza = 1;
        //피자 낱개 수 보다  사람수가
        // 적으면  피자추가
        // 많으면 사람들 먹기
        // 피자가 없어 질때까지 반복
        while(piece - n != 0 ){
            if (piece > n){
                piece = piece - n;
            }else {
                piece = piece + 6;
                pizza ++;
            }
        }
        answer = pizza;

        return answer;
    }
}
