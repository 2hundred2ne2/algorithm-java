package javaBasic;

import java.util.Arrays;

public class 배열 {

    public static  void main(String[] args){

      // 1. 배열 선언
      int[] array = {1,2,3,4,5};
      int[] array2 = new int[5];

    // 2. 배열 출력
    System.out.println(Arrays.toString(array)); //[1, 2, 3, 4, 5]
    System.out.println(Arrays.toString(array2)); //[0, 0, 0, 0, 0]

    //3.배열 삽입
    array2[0] = 1;
    array2[1] = 1;
    array2[2] = 1;
    array2[3] = 1;

    System.out.println(Arrays.toString(array2)); //[1, 1, 1, 1, 0]

    //4. 배열 삭제
    array2[1]=0;

    //2차원 배열
    int[][] array3 = new int[3][3];

        System.out.println(Arrays.toString(array3));

    }
}
