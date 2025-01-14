package BaekJoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q5014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int floor = in.nextInt();
        int init = in.nextInt();
        int goal = in.nextInt();
        int up = in.nextInt();
        int down = in.nextInt();

        // 방문한 곳 체크하기 위한 boolean배열
        boolean[] visited = new boolean[floor + 1];

        Queue<Integer> q = new LinkedList<>();
        q.add(init);
        int answer = 0;

        int num = init;
        while(!q.isEmpty() && !visited[num]){
            num = q.poll();

            answer++;
            if((num + up) <= goal && (num + up) <= floor){
                visited[num + up] = true;
                q.add(num + up);
                num = num + up;
            }else{
                visited[num - down] = true;
                q.add(num - down);
                num = num - down;
            }
        }

        System.out.println(answer);

    }
}
