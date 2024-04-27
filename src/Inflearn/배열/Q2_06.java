package Inflearn.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_06 {

    private static String solution1(int[] Arr){
        //N 입력받을 자연수 갯수를 받는다.
        //둘째 줄에 자연수들을 뒤집어서 배열에 담는다. 이 때 뒤집은 숫자의 앞에 0은 제거한다.
        //배열에 담긴 숫자를 반복하면서, 2부터 해당 숫자까지 나누어 떨어지지 않으면 소수로 인정하고,
        //answer 에 담는다.

        for(int i = 0; i < Arr.length; i++){
            String sb = new StringBuilder(String.valueOf(Arr[i])).reverse().toString();
            int K = Integer.parseInt(sb);
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

        return answer;
    }

    private static boolean isPrime(int K){
        if(K == 1) return false;
        for(int i = 2; i < K; i++){
            if(K % i == 0) return false;
        }
        return true;
    }

    private static ArrayList<Integer> solution2(int[] Arr){
        ArrayList<Integer> list = new ArrayList<>();

        // 숫자를 형변환하지 않고 숫자 그대로 남기는 방법
        // temp / 10 을 하면 몫만 남는다. ex : 23 / 10 = 2, 124 / 10 = 12;, 5 / 10 = 0
        for(int i = 0; i < Arr.length; i++){
            int temp = Arr[i];
            int res = 0;
            while (temp > 0){
                //32
                res = res * 10 + temp % 10;;
                temp = temp / 10;
            }
            if(isPrime(res))list.add(res);
        }

        return list;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] Arr = new int[N];
        for(int i = 0; i < N; i++) {
            Arr[i] = in.nextInt();
        }
        // 첫번째 방법
        //System.out.println(solution1(Arr));

        // 두번째 방법
        for(int num : solution2(Arr)){
            System.out.print(num + " ");
        }
    }
}
