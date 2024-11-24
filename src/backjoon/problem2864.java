package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 공백을 기준으로 두 숫자 추출
        String[] inputs = input.split(" ");
        if (inputs.length != 2) {
            return;
        }

        String num1 = inputs[0];
        String num2 = inputs[1];

        try {
            // 최소값 계산: 6 -> 5 치환
            int min = Integer.parseInt(num1.replaceAll("6", "5"))
                    + Integer.parseInt(num2.replaceAll("6", "5"));

            // 최대값 계산: 5 -> 6 치환
            int max = Integer.parseInt(num1.replaceAll("5", "6"))
                    + Integer.parseInt(num2.replaceAll("5", "6"));

            // 결과 출력
            System.out.println(min + " " + max);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}
