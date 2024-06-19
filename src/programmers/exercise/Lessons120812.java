package programmers.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
        programmers
        level: 0
        title: 최빈값 구하기
        url: https://school.programmers.co.kr/learn/courses/30/lessons/120812
*/
public class Lessons120812 {
    public static void main(String[] args){
        int[] testArray ={1,1,2,2};
        System.out.println(solution(testArray));
    }
    public static int solution(int[] array) {
        int answer = 0;
        HashMap<Integer,Integer> solutionMap = new HashMap<Integer,Integer>();

        for(int i=0; i < array.length; i++ ){
            if (solutionMap.containsKey(array[i])){
                solutionMap.put(array[i],solutionMap.get(array[i])+1);
                }else{
                solutionMap.put(array[i],1);
            }
        }

        Set<Integer> keySet = solutionMap.keySet();
        int tempValue = 0;

        for (Integer key : keySet) {
            if (tempValue > solutionMap.get(key)) {
                System.out.println(key+">"+solutionMap.get(key));
            }else if(tempValue == solutionMap.get(key)){
                answer = -1;
            }else{
                answer = key;
                tempValue = solutionMap.get(key);
            }
        }
        return answer;
    }
}
