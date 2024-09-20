package Inflearn.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_11_2 {
    static int[][] board, dis;
    static int[] nx = {1, 0, -1, 0};
    static int[] ny = {0, 1, 0, -1};

    private void BFS(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        board[x][y] = 1;
        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i = 0; i < 4; i++){
                int nextX = tmp.x + nx[i];
                int nextY = tmp.y + ny[i];
                if(nextX >= 1 && nextY >= 1 && nextX <= 7 && nextY <= 7 && board[nextX][nextY] == 0){
                    board[nextX][nextY] = 1;
                    q.offer(new Point(nextX, nextY));
                    dis[nextX][nextY] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Q8_11_2 main = new Q8_11_2();
        Scanner in = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                board[i][j] = in.nextInt();
            }
        }
        main.BFS(1, 1);
        if(board[7][7] == 0){
            System.out.println(-1);
        }else{
            System.out.println(dis[7][7]);
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
