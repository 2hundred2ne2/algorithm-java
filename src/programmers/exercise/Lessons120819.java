package programmers.exercise;

public class Lessons120819 {
    public static void main(String[] args) {

        System.out.println("1,000,000원은 아이스 아메리카노"+solution(1000000)[0]+"을 살 수 있고 잔돈은"+solution(1000000)[1]+"원 입니다.");
    }
    public static int[] solution(int money) {
        int[] answer = {};
        int price = 5500;
        int count = money/price;
        int charge = money%price;
        answer = new int[]{count, charge};
        return answer;
    }

    class Solution2 {
        public int[] solution(int money) {
            return new int[] { money / 5500, money % 5500 };
        }
    }

    class Solution3 {
        public int[] solution(int money) {
            int[] answer = new int[2];
            answer[0] = money/5500;
            answer[1] = money%5500;
            return answer;
        }
    }
}
