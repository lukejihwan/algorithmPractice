package BaekJoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q5014 {
    static int floor, init, goal, up, down;
    static int[] dir;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        floor = in.nextInt();
        init = in.nextInt();
        goal = in.nextInt();

        dir = new int[2];
        dir[0] = in.nextInt();
        dir[1] = -in.nextInt();

        // 숫자가 커질것이라고 예상되면 dfs보단 bfs선택
        bfs(init);
    }

    static void bfs(int init){
        Queue<Integer> q = new LinkedList<>();
        int[] move = new int[floor + 1];
        // 방문한 곳 체크하기 위한 boolean배열
        boolean[] visited = new boolean[floor + 1];

        q.add(init);
        visited[init] = true;
        move[init] = 0;

        while(!q.isEmpty()){
            int num = q.poll();

            if(num == goal){
                System.out.println(move[num]);
                return;
            }

            for(int i=0; i<2; i++) {
                int next = num + dir[i];

                if(next > floor || next < 1 ) continue;

                if(!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                    move[next]= move[num] + 1;
                }
            }

        }


        System.out.println("use the stairs");
    }
}
