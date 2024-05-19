package Inflearn.스택;

import java.util.Scanner;
import java.util.Stack;

public class Q5_01 {
    private static String solution1(String str){
        Stack<Character> stack = new Stack<>();
        for(char parenthesis : str.toCharArray()){
            if(parenthesis == ')' && stack.size() > 0 && stack.peek() == '('){
                stack.pop();
            }else{
                stack.push(parenthesis);
            }

        }

        //(를 쌓다가 )를 만나면 스택에 쌓지 않고, (를 제거한다.
        // 맨 마지막까지 실행해서 stack에 남아있지 않으면 true아니면 false를 출력한다.

        return stack.empty() ? "YES" : "NO";
    }

    private static String solution2(String str){
        Stack<Character> stack = new Stack<>();

        for(char one : str.toCharArray()){
            if(one == '('){
                stack.push(one);
            }else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(!stack.isEmpty())return "NO";

        return "YES";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution1(str));
        System.out.println(solution2(str));
    }
}
