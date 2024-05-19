package Inflearn.스택;

import java.util.Scanner;
import java.util.Stack;

public class Q5_02 {

    private static String solution1(String str){
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

        return answer;
    }

    private static String solution2(String str){
        Stack<Character> stack = new Stack<>();

        for(char N : str.toCharArray()){
            if(N == ')'){
                while(stack.pop() != '(');
            }else{
                stack.push(N);
            }
        }
        String answer = "";
        for(int i = 0; i < stack.size(); i++) answer += stack.get(i);

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution1(str));
        System.out.println(solution2(str));
    }
}
