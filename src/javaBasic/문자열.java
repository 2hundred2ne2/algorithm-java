package javaBasic;

public class 문자열 {
    public static void main(String[] args) {
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
        sb.delete(5, 6); // ',' 삭제
        System.out.println(sb.toString()); // 출력: Hello World

        // 문자열 변경
        sb.replace(6, 11, "Java");
        System.out.println(sb.toString()); // 출력: Hello Java
    }
}
