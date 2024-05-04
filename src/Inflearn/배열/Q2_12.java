package Inflearn.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        // 1부터 N 까지 돌면서 해당 숫자보다 뒤에 있는 애들을 배열에 담아두고,

        // 1번째 라인에 숫자를 하나씩 for-loop돌면서, 후순위인 숫자를 배열에 담아두고,
        // 후순위가 아닌 것들은 배열에서 0으로 처리하고 맨 마지막까지 남은 배열에 숫자들만큼 count++ 한다.
        // 이것을 첫번째 라인 마지막 숫자까지 실행한다. 마지막 숫자 - 1까지 실행하면 된다. 마지막 숫자는 멘토가 될 수 없기 때문이다.
        int[][] arr = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                arr[i][j] = in.nextInt();
            }
        }
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

        System.out.println(count);
        return ;

    }
}
