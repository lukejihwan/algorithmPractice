package BaekJoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();

            if (method.equals("push")){
                stack.add(Integer.parseInt(st.nextToken()));
            } else if (method.equals("top")) {
                if(stack.isEmpty()){
                    bw.write(-1 + "\n");
                }else {
                    bw.write(stack.peek() + "\n");
                }
            } else if (method.equals("size")) {
                bw.write(stack.size() + "\n");
            } else if (method.equals("empty")) {
                if(stack.isEmpty()){
                    bw.write(1 + "\n");
                }else {
                    bw.write(0 + "\n");
                }
            } else if (method.equals("pop")) {
                if(stack.isEmpty()){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(stack.pop() + "\n");
                }
            }
        }

        bw.close();
        br.close();

    }
}
