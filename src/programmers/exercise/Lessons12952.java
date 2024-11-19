package programmers.exercise;

public class Lessons12952 {
    private static int N; // 체스판의 크기
    private static boolean[] width; // 각 열에 퀸이 있는지 체크
    private static boolean[] diagonal1; // 왼쪽 대각선 체크
    private static boolean[] diagonal2; // 오른쪽 대각선 체크

    // ❶ 퀸이 서로 공격할 수 없는 위치에 놓이는 경우의 수를 구하는 함수
    private static int getAns(int y) {
        int ans = 0;
        // ❷ 모든 행에 대해서 퀸의 위치가 결정되었을 경우
        if (y == N) {
            // ❸ 해결 가능한 경우의 수를 1 증가시킴
            ans++;
        } else {
            // ❹ 현재 행에서 퀸이 놓일 수 있는 모든 위치를 시도
            for (int i = 0; i < N; i++) {
                // ❺ 해당 위치에 이미 퀸이 있는 경우, 대각선상에 퀸이 있는 경우 스킵
                if (width[i] || diagonal1[i + y] || diagonal2[i - y + N])
                    continue;

                // ❻ 해당 위치에 퀸을 놓음
                width[i] = diagonal1[i + y] = diagonal2[i - y + N] = true;
                // ❼ 다음 행으로 이동하여 재귀적으로 해결 가능한 경우의 수 찾기
                ans += getAns(y + 1);
                // ❽ 해당 위치에 놓인 퀸을 제거함
                width[i] = diagonal1[i + y] = diagonal2[i - y + N] = false;
            }
        }

        return ans;
    }

    public int solution(int n) {
        N = n; // 체스판 크기 설정
        width = new boolean[n]; // 열 체크 배열 초기화
        diagonal1 = new boolean[n * 2]; // 왼쪽 대각선 체크 배열 초기화
        diagonal2 = new boolean[n * 2]; // 오른쪽 대각선 체크 배열 초기화

        int answer = getAns(0); // 재귀 호출 시작
        return answer; // 가능한 경우의 수 반환
    }

    public static void main(String[] args) {
        Lessons12952 nQueens = new Lessons12952(); // N-Queens 클래스 객체 생성
        int n = 8; // 체스판 크기
        int result = nQueens.solution(n); // 해결 가능한 경우의 수 구하기
        System.out.println("Result for N = " + n + ": " + result); // 결과 출력
    }
}
