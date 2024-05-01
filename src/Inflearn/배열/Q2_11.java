package Inflearn.배열;

import java.util.Scanner;

public class Q2_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // 2차배열에 각 학생별 반 수를 저장한다.
        // N 번을 반복하면서 각 학생수와 같은 반을 한 친구 수를 비교하여, 가장 많은 학생을 출력한다.
        int[][] arr = new int[5][N];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int previous = 0, count = 0, monitor = 0;
        for(int a = 0; a < N; a++){
            boolean[] isSame = new boolean[N];
            for(int i = 0; i < 5; i++){
                int num = arr[a][i];
                count = 0;
                for(int j = 0; j < N; j++){
                    if(num == arr[j][i])isSame[j] = true;
                }
            }

            for(int x = 0; x < N; x++){
                if(isSame[x])count++;
            }

            if(previous < count){
                previous = count;
                monitor = a;
            }
        }

        System.out.println(monitor + 1);
    }
}
