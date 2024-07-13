package Inflearn.Recursive;

import java.util.Scanner;

public class Q7_04 {
    private static int[] fibo;

    private static int DFS(int n){
        // 피보나치의 가장 효율적인 방법은 for문을 사용하는 것이다
        // 재귀함수는 stack 프레임을 사용하기 때문에 메모리 측면으로 보았을 때 좋은 방법은 아니다.
        // 어쨋거나 이 문제의 핵심은 "재귀함수를 호출할 때 static 배열을 사용해 수가 할당된
        // 배열은 또 계산할 필요없이 배열에서 꺼내 쓴다" 이다.
        if(fibo[n] > 0) return fibo[n];
        if(n == 1){
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        }else{
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }
    public static void main(String[] args) {
        // 피보나치 수열(메모이제이션)
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        fibo = new int[N + 1];

        DFS(N);
        for(int i = 1; i < fibo.length; i++){
            System.out.print(fibo[i] + " ");
        }

    }
}
