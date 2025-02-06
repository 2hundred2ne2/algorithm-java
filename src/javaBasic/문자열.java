package javaBasic;

public class 문자열 {
    public static void main(String[] args) {
        // 1. StringBuilder 기본 사용 예제
        StringBuilder sb = new StringBuilder(); // 빈 StringBuilder 객체 생성

        // 문자열 추가
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb.toString()); // 출력: Hello World

        // 문자열 삽입
        sb.insert(5, ",");
        System.out.println(sb.toString()); // 출력: Hello, World

        // 문자열 삭제
        sb.delete(5, 6); // 인덱스 5부터 6 미만까지의 문자 삭제 (',' 삭제)
        System.out.println(sb.toString()); // 출력: Hello World

        // 문자열 변경
        sb.replace(6, 11, "Java");
        System.out.println(sb.toString()); // 출력: Hello Java

        // 2. 숫자와 문자열 간의 변환
        // 숫자 -> 문자열 변환
        String numStr = Integer.toString(1234);
        System.out.println(numStr); // 출력: 1234

        // 문자열 -> 숫자 변환
        int num = Integer.parseInt("1234");
        System.out.println(num); // 출력: 1234

        // 3. 문자열 자르기
        String a = "jang";
        String[] sArr = a.split(""); // 문자열을 하나씩 잘라서 배열에 저장: {"j", "a", "n", "g"}
        char[] cArr = a.toCharArray(); // 문자열을 하나씩 잘라서 char형 배열에 저장

        // String[] 을 문자열로 다시 합치기
        String joined = String.join("", sArr);
        System.out.println(joined); // 출력: jang

        // 4. 문자열 뒤집기 예제 (별도의 StringBuilder 사용)
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);   // 문자열 a 추가 ("jang")
        sb2.reverse();   // 문자열 뒤집기 -> "gnaj"
        System.out.println(sb2.toString()); // 출력: gnaj

        // 5. 문자 대소문자 변환
        System.out.println(a.toUpperCase()); // 출력: JANG (대문자)
        System.out.println(a.toLowerCase()); // 출력: jang (소문자)

        // 6. 앞뒤 공백 제거 (trim)
        String b = "  hello world  ";
        System.out.println(b.trim()); // 출력: "hello world"

        // 7. 문자열 길이
        System.out.println(a.length()); // 출력: 4

        // 8. 앞글자만 대문자로 만들기
        // 1. 첫번째 글자 substring
        String firstLetter = a.substring(0, 1);
        // 2. 첫번째 글자를 제외한 나머지 글자 substring
        String remainLetter = a.substring(1);
        // 3. 첫번째 글자를 대문자로 변환
        firstLetter = firstLetter.toUpperCase();
        // 4. 나머지 글자를 소문자로 변환
        remainLetter = remainLetter.toLowerCase();
        // 5. 두 문자열을 합치기
        String result = firstLetter + remainLetter;
        System.out.println(result); // 출력: Jang

        // 9. 문자열에 특정 문자가 포함되어 있는지 확인하기
        String text = "myeong ji";
        boolean containsMy = text.contains("my"); // 대소문자 구분
        System.out.println(containsMy); // 출력: true

        // 10. 문자열 치환
        String c = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";
        // replace([기존문자], [바꿀문자])
        String replaced = c.replace("대한", "민국");
        System.out.println(replaced);
        // 출력: 무궁화 삼천리 화려강산 민국사람 민국으로 길이 보전하세

        // replaceAll([정규식], [바꿀문자]) 예제
        String replacedAll = c.replaceAll("대한", "민국");
        System.out.println(replacedAll);
        // 출력: 무궁화 삼천리 화려강산 민국사람 민국으로 길이 보전하세

        // 11. charAt : 문자열에서 문자 가져오기
        String s = "abcde";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        // 출력:
        // a
        // b
        // c
        // d
        // e
    }
}
