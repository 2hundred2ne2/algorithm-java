package book;

import java.util.HashMap;
import java.util.HashSet;

public class 해시 {
    public static void main(String[] args) {
       String[] participant ={"leo","kiki","eden"};
       String[] completion ={"eden","kiki"};
        System.out.println(solution19(participant,completion));
    }
    /** 두 개의 수로 특정값 만들기
     * arr[1,2,3,4,8]
     * target 6
     * return true
     */
    private static boolean solution18(int[] arr,int target){
        HashSet<Integer> hashSet =new HashSet<>();
        for(int i: arr) {
            if (hashSet.contains(target - i)) {
                System.out.println(hashSet);
                return true;
            }
            hashSet.add(i);
        }
        System.out.println(hashSet);

            return false;
    }

    /** 완주하지 못한 선수
     *
     *
     *
     *
     * */
    private static String solution19(String[] perticipant,String[] completion) {
        //선수들로 키 만들기
        HashMap<String, Integer> hashMap = new HashMap<>();
        //완주한 선수들의 이름을 해시맵에 저장
        for (String s : completion) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }
        System.out.println(hashMap);
        //참가선수의 키로 하는 값을 1 씩 감소
        for (String s : perticipant) {
            if (hashMap.getOrDefault(s, 0) == 0) {
                System.out.println(s);
                return s;
            }
            hashMap.put(s, hashMap.get(s) - 1);

        }
        return null;
    }

    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        //hashmap 에 넣기
        HashMap<Integer,Integer> newHash = newHash(sequence);

        for(int i = 0;i < sequence.length; i++){
            if (newHash.get(i) + i == k){
                System.out.println(newHash);
            }
        }


        return answer;
    }

    private static HashMap<Integer,Integer> newHash(int[] sequence){
        HashMap< Integer,Integer > hashmap = new HashMap<>();
        for(int i = 0;i < sequence.length; i++){
            hashmap.put(i,sequence[i]);
        }
        return hashmap;

    }
}
