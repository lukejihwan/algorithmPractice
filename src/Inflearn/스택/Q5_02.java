package Inflearn.스택;

import java.util.Scanner;
import java.util.Stack;

public class Q5_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        Stack<Character> stack = new Stack<>();

        //stack이 비어있을 때 문자열을 String에 더한다.
        String answer = "";
        for(char element : str.toCharArray()){
            if(element == '('){
                stack.push(element);
            }else if(element == ')'){
                stack.pop();
            }else if(stack.isEmpty()){
                answer += element;
            }
        }

        System.out.println(answer);
    }
}
