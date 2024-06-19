package programmers.exercise;
/*
programmers
        level: 0
        title: 피자나눠먹기
        url: https://school.programmers.co.kr/learn/courses/30/lessons/120816

* */
public class Lessons120816 {
    public static void main(String[] args){
        System.out.println(solution(4,12));
    }
    public static int solution(int slice, int n) {
        int answer = 0;
        int  piece = slice;
        while(piece < n){

            piece = piece + slice;

        }
        answer = piece%slice == 0 ?piece/slice : piece/slice+1 ;
        return answer;
    }
}
