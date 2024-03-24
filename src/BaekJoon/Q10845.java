package BaekJoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st = null;
        int lastValue = 0;

        for(int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "push":
                    lastValue = Integer.parseInt(st.nextToken());
                    queue.add(lastValue);
                    break;
                case "pop":
                    if(queue.peek() != null){
                        bw.write(queue.poll() + "\n");
                    }else{
                        bw.write(-1 + "\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        bw.write(1 + "\n");
                    }else{
                        bw.write(0 + "\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    }else{
                        bw.write(queue.peek() + "\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()){
                        bw.write(-1 + "\n");
                    }else{
                        bw.write(lastValue + "\n");
                    }
                    break;
            }
        }

        bw.close();
        br.close();

    }
}
