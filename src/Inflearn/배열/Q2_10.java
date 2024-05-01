package Inflearn.배열;

import java.util.Scanner;

public class Q2_10 {

    private static int solution1(int[][] arr, int N){
        //N + 2 만큼의 이중배열을 만든다.
        //1 ~ N - 2까지 값들을 넣는다.
        //넣은 값들을 하나씩 체크하는데, 이 때, [i - 1], [i + 1], [j - 1], [j + 1] 보다 [i][j]가 클 때만 count++을 한다.

        int count = 0;
        for(int i = 1; i < N + 1; i++){
            for(int j = 1; j < N + 1; j++){
                int index = arr[i][j];
                if(arr[i - 1][j] < index && arr[i + 1][j] < index && arr[i][j - 1] < index && arr[i][j + 1] < index)count++;
            }
        }
        return count;
    }

    private static int solution2(int[][] arr, int N){
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        // 이중배열에서 특정 숫자 주변의 값과 값을 비교할 때 여러개의 if문을 사용하지 말고,
        // 위 처럼 미리 정의해 놓은 index탐색용 배열을 선언해두고 for문을 도는 것이 깔끔하다.
        int answer = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                boolean flag = true;
                for(int k = 0; k < dx.length; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < N && ny >= 0 && ny < N && arr[i][j] <= arr[nx][ny]){
                        flag = false;
                        break;
                    }
                }
                if(flag)answer++;
            }
        }

        return answer;
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

        int[][] arr1 = new int[N + 2][N + 2];
        for(int i = 1; i < N + 1; i++){
            for(int j = 1; j < N + 1; j++){
                arr1[i][j] = arr[i - 1][j - 1];
            }
        }
        System.out.println(solution1(arr1, N));

        System.out.println(solution2(arr, N));
    }
}
