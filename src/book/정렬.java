package book;

import java.lang.reflect.Array;
import java.util.*;

public class 정렬 {
    public static void main(String[] args) {
/*
        String s = solution50("hello");
        System.out.println(s);
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] i = solution51(arr1, arr2);
        String[] test = {"sun", "bed", "car"};
        String[] strings = solution52(test, 1);

        System.out.println();

        for (String string : strings) {
            System.out.println(string);
        }

       long s = solution53(118372);
        System.out.println(s);

        long s2 = solution53_1(118372);
        System.out.println(s2);



        int[] array = {1,5,2,6,3,7,4};
        int[][] commend ={{2,5,3},{4,4,1},{1,7,3}};

int[] result = solution54(array,commend);
        System.out.println(result);

 */
        int[] test ={3,30,34,5,9,0};
    solution55(test);
    }

    /** 계수의 정렬 구하기
     * 알파벳 순으로 정렬하기
     * s : hello  return : ehllo
     * s : algorithm return :agilmort
     * */
    private static String solution50(String s) {
        //1.  알파벳 개수 만큼의 빈도수를 체크 할 수 있는 배열 생성
        int[] counts = new int[26];

        //2. 문자열의 각 문제에 대한 빈도수를 counts에 저장
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        //빈도수 배열 을 순회 하면서 정렬된 문자열을 생성
        StringBuilder sortedStr = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < counts[i]; j++) {
                sortedStr.append((char) (i + 'a'));
            }
        }

        return sortedStr.toString();

    }

    /** 이미 정렬된  두개의 배열 합치기
     *
     * arr1: [1,3,5] arr2 : [2,4,6] return:[1,2,3,4,5,6]
     * */
    private static int[] solution51(int[] arr1, int[] arr2) {


        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            merged[k++] = arr1[i] <= arr2[j] ? arr1[i++] : arr2[j++];
        }
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }
        while (j < arr1.length) {
            merged[k++] = arr2[j++];
        }

        for (int l : merged) {

            System.out.print(l + ",");
        }

        return merged;
    }

    /**
     * 문자열 내맘대로 정렬하기
     * 각 문장의 n 열 기준으로 오름착순 정렬
     * ["sun","bed","car"] n=1 ["bed","car","sun"]
     * ["abce","abcd","cdx"] n=2 ["abce","abcd","cdx"]
     */

    private static String[] solution52(String[] strings, int n) {
        // Arrays.sort를 사용하여 정렬

        int searchIndex = n - 1;

        Arrays.sort(strings, (o1, o2) -> o1.charAt(searchIndex) == o2.charAt(searchIndex) ?
//                o1.compareTo(o2) : Character.compare(o1.charAt(searchIndex), o2.charAt(searchIndex)));
                o1.compareTo(o2) : o1.charAt(searchIndex) - o2.charAt(searchIndex));


        Arrays.sort(strings, (o1, o2) -> {
            if(o1.charAt(searchIndex) == o2.charAt(searchIndex)) {
                return o1.compareTo(o2);
            }
            return o1.charAt(searchIndex) - o2.charAt(searchIndex);
        });

        return strings;
    }
    //  정수 내림차순으로 배치하기
    /*
    * n:118372 return: 873211
    *
    * */
    private static long solution53( long n){
        // 숫자 문자열로 만들기
        String[] digits =String.valueOf(n).split("");
        for (String string: digits
             ) {
            System.out.print(string);
        }
        System.out.println();
        //내림 차순으로 정렬
        Arrays.sort(digits, Collections.reverseOrder());
        for (String string: digits
        ) {
            System.out.print(string);
        }
        System.out.println();
        // 다시 문자로 합침
        StringBuffer sb =new StringBuffer();
        for (String string: digits
        ) {
            sb.append(string);
        }
        System.out.println();
        //문자열을 long형으로 변환하여 반환
        return Long.parseLong(sb.toString());
    }
    private static long solution53_1(long n){
        // 계수정렬을 이용해서 풀기
        //0-9 빈도수 체크 할 배열 만들기
        int[] counts = new int[10];
        //반복하면서 빈도수 체크
        while(n>0){
            counts[ (int)n%10 ]++;
            n /= 10;
        }
        long answer = 0;
        //빈도수 배열을 9-0 순서로 출력
        for(int i = 9 ; 0 <= i ; i-- ){
            for(int j = 0 ; 0 <= j; counts[i]--){
                answer += i;
                answer *= 10;
            }
        }

        return answer/10;

    }
/** k번째 수
* array = [1,2,6,3,7,4] 라는 배열이 있을 때
* [2,5,3] 라는 배열은 2번째 부터 5 번째 로 자르고 정렬한 뒤 세번째 수 라는 배열
* commend = [[2,5,3],[4,4,1],[1,7,3]]
* return =[5,6,3]
* */
    public static int[] solution54(int[] arry, int[][] commend){
        int[] answer = new int[commend.length];
        for (int i =0; i<commend.length; i++) {
                 int s =commend[i][0];
                 int f =commend[i][1];
                 int k =commend[i][2];

                 // 배열 자르기
                 int[] sliceArr = Arrays.copyOfRange(arry,s-1,f);
                 //  배열 정렬하기
                 Arrays.sort(sliceArr);
                 //k 번째 수 찾기
                answer[i] = sliceArr[k-1];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    /**가장 큰 수
    * numbers [6,10,2]
     * return 6210
     * 배열의 수를 조합하여 가장 큰 수 만들기
     *
    * */
    private static String solution55(int[] numbers){
        // 문자열로 변경하기
        List<String> strings =new ArrayList<>();
        for (int num : numbers) {
            strings.add(String.valueOf(num));
        }
        System.out.println(Arrays.toString(strings.toArray()));
        //정렬
        strings.sort((o2, o1) -> {
            int a = Integer.parseInt(o1+o2);
            int b = Integer.parseInt(o2+o1);
            return Integer.compare(a,b);
        });

        System.out.println(Arrays.toString(strings.toArray()));
//문자로 변경
        StringBuffer sb= new StringBuffer();
     for(String s:strings){
         sb.append(s);
     }
        System.out.println(sb);
        return sb.toString();
    }


}
