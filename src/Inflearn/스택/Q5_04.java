package Inflearn.스택;

import java.util.Scanner;
import java.util.Stack;

public class Q5_04 {
    private static int solution1(char[] arr){
        Stack<Integer> stack = new Stack<>();

        // Stack에 쌓는데, 기호가 나오면 두개를 빼서 계산하고 그 자리에 쌓는다.
        // 배열의 반복문을 끝날때까지 반복한다.
        for(int i = 0; i < arr.length; i++){
            if(Character.isDigit(arr[i])){
                stack.push(Character.getNumericValue(arr[i]));
            }else{
                int num1 = stack.pop();
                int num2 = stack.pop();
                if(arr[i] == '+'){
                    stack.push(num2 + num1);
                }else if(arr[i] == '-'){
                    stack.push(num2 - num1);
                }else if(arr[i] == '*'){
                    stack.push(num2 * num1);
                }else if(arr[i] == '/'){
                    stack.push(num2 / num1);
                }
            }
        }

        return stack.get(0);
    }

    private static int solution2(char[] arr){
        Stack<Integer> stack = new Stack<>();

        for(char n : arr){
            if(Character.isDigit(n)){
                stack.push(n - 48);
            }else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(n == '+') stack.push(lt + rt);
                else if(n == '-') stack.push(lt - rt);
                else if(n == '*') stack.push(lt * rt);
                else if(n == '/') stack.push(lt / rt);
            }
        }

        return stack.get(0);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();

        // 배열에 넣는다.
        char[] arr = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }

        System.out.println(solution1(arr));
        System.out.println(solution2(arr));
    }
}
