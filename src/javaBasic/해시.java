package javaBasic;

import java.util.HashMap;

public class 해시 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        //hashMap에 데이터 추가
        hashMap.put("ABC", 10);
        hashMap.put("BBB", 20);
        hashMap.put("AAA", 38);
        System.out.println(hashMap);
        hashMap.put("ABC", 40);
        System.out.println(hashMap);

        System.out.println(hashMap.isEmpty());//false
        System.out.println(hashMap.size());//3

        System.out.println(hashMap.get("AAA"));
        System.out.println(hashMap.remove("ABC"));
        System.out.println(hashMap);
        System.out.println(hashMap.containsKey("AAA"));
        System.out.println(hashMap.containsKey("ABC"));


        hashMap.clear();
        System.out.println(hashMap.isEmpty());//ture

    }
}


class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int sum = 0;
        int length = 1000001;

        for (int i = 0; i < sequence.length; i++) {
            sum += sequence[i];
            if (sum == k) {
                answer[0] = i;
                answer[1] = i;
                return answer;
            }
            for (int j = i + 1; j < sequence.length; j++) {
                sum += sequence[j];
                if (sum == k) {
                    if ((j - i) < length) {
                        answer[0] = i;
                        answer[1] = j;
                        length = (j - i);

                    }
                }
            }
            sum = 0;
        }
        return answer;
    }
}