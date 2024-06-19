package programmers.exercise;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Lessons120820 {
    public static void main(String[] args) {
        System.out.println(solution(29));
    }

    public static int solution(int age) {
        int answer = 0;
        LocalDate now = LocalDate.now();
        answer = now.getYear() - age + 1;
        return answer;
    }

    class Solution2 {
        public int solution(int age) {
            LocalDate today = LocalDate.now();
            return today.getYear() - age + 1;
        }
    }
}