package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q5014_2 {
    static int f, s, g;
    static int[] dir;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        f = in.nextInt();
        s = in.nextInt();
        g = in.nextInt();

        dir = new int[2];
        dir[0] = in.nextInt();
        dir[1] = -in.nextInt();

        bfs(s);

    }

    static void bfs(int start){
        boolean[] visited = new boolean[f + 1];
        int[] move = new int[f + 1];
        Queue<Integer> q = new LinkedList();

        q.add(start);
        visited[s] = true;

        while(!q.isEmpty()){
            int num = q.poll();

            if(num == g){
                System.out.println(move[num]);
                return;
            }

            for(int i = 0; i < 2; i++){
                int next = num + dir[i];

                if(next > f || next < 1) continue;

                if(!visited[next]){
                    q.add(next);
                    visited[next] = true;
                    move[next] = move[num] + 1;
                }
            }
        }

        System.out.println("use the stairs");

    }
}
