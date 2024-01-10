package BaekJoon;

import java.io.*;
import java.util.Arrays;

public class Q2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strArr = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);

        int[][] matrix = new int[N][M];

        for(int i = 0; i < N; i++){
            String[] strArray1 = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                matrix[i][j] += Integer.parseInt(strArray1[j]);
            }
        }

        for(int i = 0; i < N; i++){
            String[] strArray2 = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                matrix[i][j] += Integer.parseInt(strArray2[j]);
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < M; j++){
                bw.write(matrix[i][j] + " ");
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
