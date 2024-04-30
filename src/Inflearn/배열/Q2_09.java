package Inflearn.배열;

import java.util.Scanner;

public class Q2_09 {


    private static int solution1(int[][] arr, int N){
        int rowMax = 0;
        int columnMax = 0;

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
        int diagonalMax1 = 0;
        int diagonalMax2 = 0;
        // 첫번째 줄에서는 처음과 끝 값을 더하고, 두번째 줄에서는 처음 + 1, 끝 - 1 값을 더하고, 마지막까지 이처럼 반복해 나간다.
        for(int i = 0; i < N; i++){
            diagonalMax1 += arr[i][i];
            diagonalMax2 += arr[i][N - 1 - i];
        }
        int diagonalMax = Math.max(diagonalMax1, diagonalMax2);

        return Math.max(rowMax, columnMax) < diagonalMax ? diagonalMax : Math.max(rowMax, columnMax);
    }

    private static int solution2(int[][] arr, int N){
        int result = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i = 0; i < N; i++){
            sum1 = sum2 = 0;
            for(int j = 0; j < N; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            result = Math.max(sum1, sum2);
        }

        sum1 = sum2 = 0;
        for(int i = 0; i < N; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][N - 1 - i];
        }
        result = Math.max(result, sum1);
        result = Math.max(result, sum2);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[][] arr = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution1(arr, N));
        System.out.println(solution2(arr, N));
    }
}
