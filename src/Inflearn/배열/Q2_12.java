package Inflearn.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_12 {
    private static int solution1(int[][] arr, int N, int M){
        // 1번째 라인에 숫자를 하나씩 for-loop돌면서, 후순위인 숫자를 배열에 담아두고,
        // 후순위가 아닌 것들은 배열에서 0으로 처리하고 맨 마지막까지 남은 배열에 숫자들만큼 count++ 한다.
        // 이것을 첫번째 라인 마지막 숫자까지 실행한다. 마지막 숫자 - 1까지 실행하면 된다. 마지막 숫자는 멘토가 될 수 없기 때문이다.
        int count = 0;
        for(int i = 0; i < N; i++){
            int num = arr[0][i];
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < M; j++){
                int index = Integer.MAX_VALUE;
                for(int a = 0; a < N; a++){
                    if(num == arr[j][a]){
                        index = a;
                    }
                    if(index < a){
                        list.add(arr[j][a]);
                    }
                }
            }

            for(int x = 1; x <= N; x++){
                int numCount = 0;
                for(int z = 0; z < list.size(); z++){
                    if(list.get(z) == x){
                        numCount++;
                    }
                }
                if(numCount == M)count++;
            }
        }
        return count;
    }

    private static int solution2(int[][] arr, int N, int M){
        // 멘토 멘티가 되는 경우에 수를 모두 체크하는 방식으로 진행한다.
        // 그래서, (1, 2), (1, 3) 이런식으로 1번 학생과 2번 학생이 멘토 멘티가 가능한 관계인지 또 다른 2중 for문을 통해서 체크해서
        // count 해서 결과를 반환한다.
        int result = 0;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                int count = 0;
                int pi = 0, pj = 0;

                for(int k = 0; k < M; k++){
                    for(int s = 0; s < N; s++){
                        if(i == arr[k][s]){
                            pi = s;
                        } else if (j == arr[k][s]) {
                            pj = s;
                        }
                    }
                    if(pi < pj)count++;
                }

                if(count == M)result++;

            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[][] arr = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution1(arr, N, M));
        System.out.println(solution2(arr, N, M));
    }
}
