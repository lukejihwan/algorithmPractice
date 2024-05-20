package Inflearn.스택;

import java.util.Scanner;

public class Q5_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] board = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = in.nextInt();
            }
        }

        int K = in.nextInt();
        int[] moves = new int[K];
        for(int i = 0; i < K; i++){
            moves[i] = in.nextInt();
        }
    }
}
