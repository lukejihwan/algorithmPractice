package BaekJoon;

import java.io.*;
import java.util.Stack;

public class Q1874 {

    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();	// 출력할 결과물 저장

        int N = Integer.parseInt(br.readLine());

        int start = 0;

        while(N-- > 0) {

            int value = Integer.parseInt(br.readLine());

            if(value > start) {
                // start + 1부터 입력받은 value 까지 push를 한다.
                for(int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = value; 	// 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            } else if (stack.peek() != value) {
                bw.write("NO" + "\n");
                br.close();
                bw.close();
                return;		// 또는 System.exit(0); 으로 대체해도 됨.
            }

            stack.pop();
            sb.append('-').append('\n');

        }

        bw.write(sb.toString() + "\n");
        br.close();
        bw.close();
    }
}
