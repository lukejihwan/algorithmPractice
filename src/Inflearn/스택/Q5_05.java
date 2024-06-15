package Inflearn.스택;

import java.util.Scanner;
import java.util.Stack;

public class Q5_05 {
    private static int solution1(String str){
        // stack에 아무 것도 없이 레이저를 쏘면 쇠막대는 없으므로, + 0 이다.
        // stack에 쌓인 ( 표시는 자릴 쇠막대의 갯수를 말한다.
        // )으로 쇠막대가 끝날때는 하나의 쇠막대가 끝나고 + 1된다.

        Stack<Character> stack = new Stack<>();
        int answer = 0;
        char last = ' ';
        for(char n : str.toCharArray()){
            if(n == '('){
                stack.push(n);
            }else if(last == ')' && n == ')'){
                stack.pop();
                answer += 1;
            }else if(stack.peek() == '(' && n == ')'){
                stack.pop();
                answer += stack.size();
            }
            last = n;
        }

        return answer;
    }

    private static int solution2(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') stack.push('(');
            else{
                if(str.charAt(i - 1) == '('){
                    stack.pop();
                    answer += stack.size();
                }else{
                    stack.pop();
                    answer += 1;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution1(str));
        System.out.println(solution2(str));
    }
}
