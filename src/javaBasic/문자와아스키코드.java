package javaBasic;

public class 문자와아스키코드 {
    public static void main(String[] args) {
        // 문자 'A'의 아스키 코드 값을 출력
        char charA = 'A';
        int asciiA = (int) charA;
        System.out.println("Character: " + charA + ", ASCII Code: " + asciiA); // 출력: Character: A, ASCII Code: 65

        // 문자 'a'의 아스키 코드 값을 출력
        char charLowerA = 'a';
        int asciiLowerA = (int) charLowerA;
        System.out.println("Character: " + charLowerA + ", ASCII Code: " + asciiLowerA); // 출력: Character: a, ASCII Code: 97

        // 'a'에 1을 더하면 무엇이 되는가?
        char nextChar = (char) (charLowerA + 1);
        System.out.println("Character after 'a': " + nextChar); // 출력: Character after 'a': b

        // 숫자 5를 문자로 변환
        int number = 5;
        char charNumber = (char) (number + '0'); // '0'의 아스키 값은 48, 따라서 '5'가 됨
        System.out.println("Character for number 5: " + charNumber); // 출력: Character for number 5: 5

        // 'Z'에 1을 더하면 무엇이 되는가?
        char charZ = 'Z';
        char nextAfterZ = (char) (charZ + 1);
        System.out.println("Character after 'Z': " + nextAfterZ); // 출력: Character after 'Z': [
        System.out.println('a'+1);
        System.out.println((char)('a'+1));

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

