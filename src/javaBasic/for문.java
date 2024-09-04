package javaBasic;

public class for문 {
    public static void main(String[] args) {
        //psvm  으로  메인 함수 만들기

        //1.for문
        //전통적인 for문
        for (int i=0; i<10; i++){
            System.out.println(i);
        }

        //향상된 for
        // 배열을 순회 할 때
        int[] number = {1,2,3,4,5};
        for (int num: number) {
            System.out.println(num);
        }
        String s = "hello";
        for (char c : s.toCharArray()){
            System.out.println(c);
        }
        char[] cArray = s.toCharArray();
        System.out.println( cArray);
        //



        //중첩 for

        for (int i = 0; i <= 9; i++){
            for(int j =0; j<=9; j++){
                System.out.println(i +"x"+j + "="+(i*j));
            }
        }
        //무한 루프 for
        for (;;) {
            // 무한 루프
            System.out.println("무한 루프");
            break; // 이 조건이 없으면 무한히 반복됩니다.
        }
    }
}
