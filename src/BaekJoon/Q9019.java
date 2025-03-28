package BaekJoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q9019 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] numbers = new int[n][2];
        for(int i = 0; i < n; i++){
            numbers[i][0] = in.nextInt();
            numbers[i][1] = in.nextInt();
        }

        for(int i = 0; i < n; i++){
            int init = numbers[i][0];
            int goal = numbers[i][1];
            Queue<Integer> q = new LinkedList<>();
            boolean[] visited = new boolean[10000];
            String[] command = new String[10000];

            q.add(init);
            visited[init] = true;
            Arrays.fill(command, "");

            while(!q.isEmpty() && !visited[goal]){
                int now = q.poll();

                int D = (2 * now) % 10000;
                int S = now == 0 ? 9999 : now - 1;
                int L = (now % 1000) * 10 + now / 1000;
                int R = (now % 10) * 1000 + now / 10;

                if (!visited[D]) {
                    q.add(D);
                    visited[D] = true;
                    command[D] = command[now] + "D";
                }

                if (!visited[S]) {
                    q.add(S);
                    visited[S] = true;
                    command[S] = command[now] + "S";
                }

                if (!visited[L]) {
                    q.add(L);
                    visited[L] = true;
                    command[L] = command[now] + "L";
                }

                if (!visited[R]) {
                    q.add(R);
                    visited[R] = true;
                    command[R] = command[now] + "R";
                }

                if(visited[L]){}
            }
            System.out.println(command[goal]);

        }



    }
}
