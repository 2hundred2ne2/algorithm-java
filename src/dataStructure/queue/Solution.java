package dataStructure.queue;


import java.util.*;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        // 우선순위 큐 생성
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        // 값 넣기
        pq.add(4);
        pq.add(3);
        pq.add(1);
        pq.add(5);
        pq.add(2);
        // 큐의 정렬 상태 확인
        System.out.println(pq);//[1, 2, 3, 5, 4]
        // 우선 순위 큐의   가장 작은 요소 확인 및 제거
        System.out.println(pq.poll());//1 제거
        System.out.println(pq);//2,4,3,5
        System.out.println(pq.poll());//2 제거
        System.out.println(pq);//3,4,5

        //데이터 자체에 우선순위를 직접 정한다.
        //두번쨰 문자열의  크기의 우선 순위가 높은 순서
        PriorityQueue<String> pq2 = new PriorityQueue<>(Comparator.comparingInt(o->o.charAt(2)));
        pq2.add("4444");
        pq2.add("333");
        pq2.add("11111");
        pq2.add("55555");
        pq2.add("22ㄷ");
        // 큐의 정렬 상태 확인
        System.out.println(pq2);//[1, 2, 3, 5, 4]
        // 우선 순위 큐의   가장 작은 요소 확인 및 제거
        System.out.println(pq2.poll());//
        System.out.println(pq2);//
        System.out.println(pq2.poll());//
        System.out.println(pq2);//

        // 값이 클 수록 우선 순위가 높게 하려면?
        PriorityQueue<Integer> pq3 =new PriorityQueue<>(Collections.reverseOrder());
        // 값 넣기
        pq3.add(4);
        pq3.add(3);
        pq3.add(1);
        pq3.add(5);
        pq3.add(2);
        // 큐의 정렬 상태 확인
        System.out.println(pq3);//
        // 우선 순위 큐의   가장  큰 요소 확인 및 제거
        System.out.println(pq3.poll());//54132
        System.out.println(pq3);//5
        System.out.println(pq3.poll());//43132
        System.out.println(pq3);//321

        //값을 한꺼번에 우선순위 큐에 넣으려면?
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(1);


        //컬렉션의 모든 데이터를 우선순위 큐에 담아 생성
        PriorityQueue<Integer> pq4 =new PriorityQueue<>(list);
        System.out.println(pq4);
        System.out.println(pq4.poll());
        System.out.println(pq4.poll());
        System.out.println(pq4.poll());
        System.out.println(pq4.poll());
        System.out.println(pq4);

        //컬렉션의 모든 데이커를 우선순위 큐에 추가
        pq4.addAll(list);

        System.out.println(pq4);





    }
}
