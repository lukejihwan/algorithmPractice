package BaekJoon;

import java.util.Scanner;

public class Q1987_02 {
    static int r, c;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;
    static boolean[] alpha;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        c = in.nextInt();
        map = new int[r][c];
        for(int i = 0; i < r; i++){
            String line = in.next();
            for(int j = 0; j < c; j++){
                map[i][j] = line.charAt(j) - 'A';
            }
        }

        alpha = new boolean[26];
        DFS(0, 0, 1);
        System.out.println(answer);
    }
    public static void DFS(int y, int x, int level){
        alpha[map[y][x]] = true;
        answer = Math.max(answer, level);

        // 아무곳도 갈수없으면 끝난다.
        for(int i = 0; i < dx.length; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if (nextX >= 0 && nextX < c && nextY >= 0 && nextY < r){
                // 방문한적이 없는 node여야한다.
                if(alpha[map[nextY][nextX]] == false){
                    DFS(nextY, nextX, level + 1);
                    alpha[map[nextY][nextX]] = false;

                }

            }

        }


    }

}
