package BaekJoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int count = Integer.parseInt(br.readLine());

        for(int i = 1; i <= count; i++){
            queue.offer(i);
        }

        //큐에 count만큼의 숫자를 넣는다.

        //1을 버리고, 2는 뒤로 보내고 를 하나가 남을 때까지 반복한다.

        while (queue.size() != 1){
            queue.poll();
            int front = queue.poll();
            queue.offer(front);

        }

        bw.write(queue.peek() + "\n");
        br.close();
        bw.close();

    }
}
