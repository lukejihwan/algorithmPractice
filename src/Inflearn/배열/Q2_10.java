package Inflearn.배열;

import java.util.Scanner;

public class Q2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        //N + 2 만큼의 이중배열을 만든다.
        //1 ~ N - 2까지 값들을 넣는다.
        //넣은 값들을 하나씩 체크하는데, 이 때, [i - 1], [i + 1], [j - 1], [j + 1] 보다 [i][j]가 클 때만 count++을 한다.
        int[][] arr = new int[N + 2][N + 2];
        for(int i = 1; i < N + 1; i++){
            for(int j = 1; j < N + 1; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int count = 0;
        for(int i = 1; i < N + 1; i++){
            for(int j = 1; j < N + 1; j++){
                int index = arr[i][j];
                if(arr[i - 1][j] < index && arr[i + 1][j] < index && arr[i][j - 1] < index && arr[i][j + 1] < index)count++;
            }
        }

        System.out.println(count);
    }
}
