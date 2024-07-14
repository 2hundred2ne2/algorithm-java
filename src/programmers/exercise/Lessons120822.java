package programmers.exercise;

public class Lessons120822 {

    public static void main(String[] args){
        int[] test ={1,2,3,4,5};

        System.out.println(solution("test"));
    }

        public static String solution(String my_string) {
            String answer = "";
            StringBuffer sb =new StringBuffer(my_string);
            answer = sb.reverse().toString();
            return answer;
        }


}
