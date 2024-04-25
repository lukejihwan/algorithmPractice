package Inflearn;

import java.util.Scanner;

public class Q2_04 {

    private static int[] solution1(int N){
        // 최소 입력 수가 3 이므로, 3까지 입력하고 그 다음부터 for-loop을 돈다.
        // 앞의 두 수의 합을 N까지 출력해 나간다.
        int[] Arr = new int[N];
        Arr[0] = 1;
        Arr[1] = 1;
        for(int i = 2; i < N; i++){
            Arr[i] = Arr[i - 1] + Arr[i - 2];
        }
        return Arr;
    }
    private static void solution2(int N){
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i < N; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int K : solution1(N)){
            System.out.print(K + " ");
        }
        System.out.println();
        solution2(N);
    }
}
