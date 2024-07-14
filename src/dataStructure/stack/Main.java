package dataStructure.stack;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>(); // push, pop, peek, empty, search 지원
        System.out.println(stack.empty()); //ture
        for(int i =1; i<=5 ; i++){
            stack.push(i);
            System.out.println(stack.peek());
        } // 1,2,3,4,5  출력
        stack.pop();
        System.out.println("Pop()");
        System.out.println(stack.peek());//4
        System.out.println(stack.search(3));//2 ArrayList는  0부터 stack의 search는 1 부터 시작
        System.out.println(stack.empty());

        //문자열 거꾸로 출력
        while ( 1 <= stack.size()){
            System.out.println(stack.peek());
            stack.pop();
        }


        Stack<Integer> stackL = new Stack<>();
        Stack<Integer> stackR = new Stack<>();

        String test = "AABBAB";
        int size = test.length();
        System.out.println(test.length());
        System.out.println(removefirstChar(test));

        if( size%2 == 0){
            while (test.length() == 0){
                stackL.push(test.substring(1).toStrinting);
            }


        }


    }
    public static String removefirstChar(String str)
    {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(1);
    }
}
