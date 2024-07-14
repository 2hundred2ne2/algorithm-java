package programmers.exercise;

import java.util.Scanner;

public class Lessons120823 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 1; i<=n;i++){
                int j = i;
                while (0<j){
                    System.out.print("*");
                    --j;
                }
                System.out.println("");
            }


        }


}
