package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q5015_2 {
    static int f, s, g, u, d;
    static boolean[] visited;
    static int[] move;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        f = in.nextInt();
        s = in.nextInt();
        g = in.nextInt();
        u = in.nextInt();
        d = in.nextInt();

        visited = new boolean[f + 1];
        move = new int[f + 1];
        bfs(s);
    }

    public static void bfs(int s){
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;
        move[s] = 0;

        while(!q.isEmpty()){
            int num = q.poll();
            if(num == g){
                System.out.println(move[num]);
                return;
            }

            System.out.println(num + ": " + move[num]);
            int unext = num + u;
            if(unext >= 1 && unext <= f && !visited[unext]){
                q.add(unext);
                visited[unext] = true;
                move[unext] = move[num] + 1;
            }

            int dnext = num - d;
            if(dnext >= 1 && dnext <= f && !visited[dnext]){
                q.add(dnext);
                visited[dnext] = true;
                move[dnext] = move[num] + 1;
            }
            System.out.println("use elevator");
        }

        System.out.println("use the stairs");
    }
}
