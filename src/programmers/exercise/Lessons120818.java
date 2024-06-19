package programmers.exercise;
/*
        programmers
        level: 0
        title: 옷가게 할인 받기
        url: https://school.programmers.co.kr/learn/courses/30/lessons/120818
*/
public class  Lessons120818{
    public static void main(String[] args){
        System.out.println(solution(580000));
    }
    public static int solution(int price) {
        int answer = 0;

        if (price >= 500000)return (int) (price - price*0.2);
        if (price >= 300000) return (int) (price - price*0.1);
        if (price >= 100000) return (int) (price - price*0.05);
        return price;

    }
    public int solution2(int price) {
        int answer = 0;

        if(price>=500000) return (int)(price*0.8);
        if(price>=300000) return (int)(price*0.9);
        if(price>=100000) return (int)(price*0.95);

        return price;
    }
}
