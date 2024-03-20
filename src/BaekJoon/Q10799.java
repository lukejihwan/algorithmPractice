package BaekJoon;

import java.io.*;
import java.util.Stack;

public class Q10799 {

    static Stack<String> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // () 가 있는 곳에서 잘린다.
        // () 만 단독으로 있으면 stack에서 제거하고 잘린 쇠막대기는 없다

        // 스택에 '('가 쌓여있는 만큼 () 레이저가 쏘일 때 + '(' 갯수만큼 더한다.

        // )) 일 때는 두번째 )가 쇠막대기의 끝을 나타내므로, + 1을 해주고 (를 하나 빼준다.

        int count = 0;

        String[] str = br.readLine().split("");
        String lastParenthesis = "";

        for(int i = 0; i < str.length; i++){

            if (!stack.isEmpty() && lastParenthesis.equals("(") && str[i].equals(")")){
                stack.pop();
                int size = stack.size();

                count += size;

            } else if (!stack.isEmpty() && lastParenthesis.equals(")") && str[i].equals(")")) {
                count += 1;
                stack.pop();

            }else{
                stack.push(str[i]);
            }

            lastParenthesis = str[i];

        }

        bw.write(count + "\n");
        br.close();
        bw.close();
    }
}
