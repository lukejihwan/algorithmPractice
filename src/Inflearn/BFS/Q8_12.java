package Inflearn.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_12 {
    static int[][] board, dis;
    static int n, m;
    static int[] nx = {1, 0, -1, 0};
    static int[] ny = {0, 1, 0, -1};

    private void BFS(){
        Queue<Point> Q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 1){
                    Q.offer(new Point(i, j));
                }
            }
        }

        while(!Q.isEmpty()){
            Point tmp = Q.poll();
            for(int i = 0; i < 4; i++){
                int nextX = tmp.x + nx[i];
                int nextY = tmp.y + ny[i];
                if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && board[nextX][nextY] == 0){
                    board[nextX][nextY] = 1;
                    dis[nextX][nextY] = dis[tmp.x][tmp.y] + 1;
                    Q.offer(new Point(nextX, nextY));

                }
            }

        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q8_12 main = new Q8_12();
        m = in.nextInt();
        n = in.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int num = in.nextInt();
                if(num == -1 || num == 1){
                    dis[i][j] = num;
                }
                board[i][j] = num;
            }
        }
        main.BFS();
        int max = 0, zeroCount = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int num = dis[i][j];
                if(num == 0){
                    zeroCount++;
                }
                max = Math.max(max, num);
            }
        }
        if(zeroCount > 0){
            System.out.println(-1);
        }else{
            System.out.println(max - 1);
        }

    }

    private class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
