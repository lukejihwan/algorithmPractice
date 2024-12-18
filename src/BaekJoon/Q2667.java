package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2667 {
    static int[][] map;
    static int answer, n, count;
    static ArrayList<Integer> list = new ArrayList<>();
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void solution(){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int y = map[i][j];
                if(y == 1){
                    answer++;
                    DFS(i, j);
                    list.add(count);
                    count = 0;
                }
            }

        }
    }

    public static void DFS(int y, int x)
    {
        count++;
        map[y][x] = 0;
        for(int i = 0; i < 4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && map[nextY][nextX] == 1){

                DFS(nextY, nextX);
            }

        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        map = new int[n][n];

        for(int i = 0; i < n; i++){
            String line = in.next();
            for(int j = 0; j < n; j++){
                map[i][j] = Integer.parseInt(Character.toString(line.charAt(j)));
            }
        }

        solution();

        Collections.sort(list);

        System.out.println(answer);
        for(int a : list){
            System.out.println(a);
        }

    }
}
