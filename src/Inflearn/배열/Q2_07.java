package Inflearn.배열;

import java.util.Scanner;

public class Q2_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 문제의 갯수 N을 입력받는다.
        // 1 이 나오면 count++을 하고
        // 0이면 count를 정답에 더하고, 0으로 초기화 시킨다.
        int N = in.nextInt();
        int[] Arr = new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = in.nextInt();
        }
        int answer = 0;
        int count = 0;
        for(int i = 0; i < N; i++){
            if(Arr[i] == 1){
                count++;
                answer += count;
            }else if(Arr[i] == 0){
                count = 0;
            }
        }

        System.out.println(answer);
    }
}
