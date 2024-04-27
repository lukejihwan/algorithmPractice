package Inflearn.배열;

import java.util.Scanner;

public class Q2_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //N 입력받을 자연수 갯수를 받는다.
        //둘째 줄에 자연수들을 뒤집어서 배열에 담는다. 이 때 뒤집은 숫자의 앞에 0은 제거한다.
        //배열에 담긴 숫자를 반복하면서, 2부터 해당 숫자까지 나누어 떨어지지 않으면 소수로 인정하고,
        //answer 에 담는다.
        int N = in.nextInt();
        int[] Arr = new int[N];
        for(int i = 0; i < N; i++){
            int K = in.nextInt();
            String sb = new StringBuilder(String.valueOf(K)).reverse().toString();
            K = Integer.parseInt(sb);
            Arr[i] = K;
        }

        String answer = "";
        for(int i = 0; i < Arr.length; i++){
            int num = Arr[i];
            boolean flag = true;
            for(int j = 2; j < num; j++){
                if(num % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag && num != 1) answer += num + " ";
        }

        System.out.println(answer);
    }
}
