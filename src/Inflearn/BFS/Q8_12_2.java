package Inflearn.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_12_2 {
    static int m, n;
    static int[][] board, dis;
    static Queue<Point1> Q = new LinkedList<>();
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    private void BFS(){
        while(!Q.isEmpty()){
            Point1 tmp = Q.poll();
            for(int i = 0; i < 4; i++){
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    Q.offer(new Point1(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q8_12_2 main = new Q8_12_2();
        m = in.nextInt();
        n = in.nextInt();

        board = new int[n][m];
        dis = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                board[i][j] = in.nextInt();
                if(board[i][j] == 1) Q.offer(new Point1(i, j));
            }
        }
        main.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 0)flag = false;
            }
        }

        if(flag){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }
    }


}

class Point1{
    int x, y;
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }
}
