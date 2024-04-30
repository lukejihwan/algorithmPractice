package Inflearn.배열;

import java.util.Scanner;

public class Q2_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[][] arr = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int rowMax = 0;
        int columnMax = 0;
        int diagonalMax = 0;

        for(int i = 0; i < N; i++){
            int rowMax2 = 0;
            for(int j = 0; j < N; j++){
                rowMax2 += arr[i][j];
            }
            rowMax = rowMax > rowMax2 ? rowMax : rowMax2;
        }

        for(int i = 0; i < N; i++){
            int columnMax2 = 0;
            for(int j = 0; j < N; j++){
                columnMax2 += arr[j][i];
            }
            columnMax = columnMax > columnMax2 ? columnMax : columnMax2;
        }
    }
}
