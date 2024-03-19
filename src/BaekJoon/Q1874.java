package BaekJoon;

import java.io.*;
import java.util.Stack;

public class Q1874 {

    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int start = 0;

        while(N-- > 0) {

            int value = Integer.parseInt(br.readLine());

            if(value > start) {
                for(int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = value;
            } else if (stack.peek() != value) {
                bw.write("NO" + "\n");
                br.close();
                bw.close();
                return;
            }

            stack.pop();
            sb.append('-').append('\n');

        }

        bw.write(sb.toString() + "\n");
        br.close();
        bw.close();
    }
}
