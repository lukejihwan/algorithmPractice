package Inflearn.BFS;

import java.util.Scanner;

public class Q8_13 {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
    static int answer, m;

    private void DFS(int x, int y, int[][] board){
        for(int i = 0; i < 8; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if(nextX >= 0 && nextX < m && nextY >= 0 && nextY < m && board[nextX][nextY] == 1){
                board[nextX][nextY] = 0;
                DFS(nextX, nextY, board);
            }
        }

    }
    private void solution(int[][] board){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                int num = board[i][j];
                if(num == 1){
                    answer++;
                    board[i][j] = 0;
                    DFS(i, j, board);
                }
            }

        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q8_13 main = new Q8_13();
        m = in.nextInt();
        int[][] board = new int[m][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                board[i][j] = in.nextInt();
            }
        }
        main.solution(board);
        System.out.println(answer);

    }
}
