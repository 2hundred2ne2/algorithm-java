package backjoon;

import java.util.Scanner;

public class problem15652 {

    // 전역 변수 선언
    public static int N, M; // N: 최대 숫자, M: 선택할 숫자의 개수
    public static int[] arr; // 선택된 숫자를 저장할 배열

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner 객체 생성

        N = in.nextInt(); // 사용자로부터 최대 숫자 N 입력
        M = in.nextInt(); // 사용자로부터 선택할 숫자 개수 M 입력
        arr = new int[M]; // 선택된 숫자를 저장할 배열 초기화

        dfs(1, 0); // 깊이 우선 탐색 시작, at = 1, depth = 0
    }

    // 깊이 우선 탐색 메서드
    public static void dfs(int at, int depth) {
        // 현재 선택한 숫자의 개수가 M과 같으면
        if (depth == M) {
            // 선택된 숫자 출력
            for (int val : arr) {
                System.out.print(val + " "); // 배열 arr의 모든 값 출력
            }
            System.out.println(); // 출력 후 줄 바꿈
            return; // 재귀 호출 종료
        }

        // at부터 N까지 반복
        for (int i = at; i <= N; i++) {
            arr[depth] = i; // 현재 깊이에 숫자 i 저장
            dfs(i, depth + 1); // 다음 깊이 탐색, i를 유지하여 중복 허용
        }
    }
}
