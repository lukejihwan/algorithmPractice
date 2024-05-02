package Inflearn.배열;

import java.util.Scanner;

public class Q2_11 {

    private static int solution1(int[][] arr, int N){
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

        return monitor + 1;
    }

    private static int solution2(int[][] arr, int N){
        int max = Integer.MIN_VALUE, answer = 0;
        for(int i = 0; i < N; i++){
            int count = 0;
            for(int j = 0; j < N; j++){
                for(int a = 0; a < 5; a++){
                    if(arr[i][a] == arr[j][a]){
                        count++;
                        break;
                    }
                }
            }

            if(max < count){
                max = count;
                answer =  i + 1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // 2차배열에 각 학생별 반 수를 저장한다.
        // N 번을 반복하면서 각 학생수와 같은 반을 한 친구 수를 비교하여, 가장 많은 학생을 출력한다.
        int[][] arr = new int[N][5];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution1(arr, N));
        System.out.println(solution2(arr, N));
    }
}
