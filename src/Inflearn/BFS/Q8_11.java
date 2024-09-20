package Inflearn.BFS;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_11 {
    static int[][] board;
    static int[] nx = {1,0,-1,0};
    static int[] ny = {0,1,0,-1};
    static boolean flag = false;

    private void BFS(){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0, 1, 1));

        while(!q.isEmpty()){
            Point point = q.poll();
            board[point.x][point.y] = 1;
            if(point.x == 7 && point.y == 7){
                System.out.println(point.level);
                flag = true;
                break;
            }

            for(int i = 0; i < 4; i++){
                int nextX = point.x + nx[i];
                int nextY = point.y + ny[i];
                if(nextX >= 1 && nextX <= 7 && nextY >=1 && nextY <= 7 && board[nextX][nextY] == 0){
                    q.offer(new Point(point.level + 1, nextX, nextY));

                }
            }
        }


    }
    public static void main(String[] args) {
        Q8_11 main = new Q8_11();
        Scanner in = new Scanner(System.in);
        board = new int[8][8];
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 7; j++){
                board[i][j] = in.nextInt();
            }
        }
        main.BFS();
        if (!flag) System.out.println(-1);

    }

}

class Point{
    int level, x, y;
    public Point(int level, int x, int y){
        this.level = level;
        this.x = x;
        this.y = y;
    }


}
