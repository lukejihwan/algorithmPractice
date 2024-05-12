package Inflearn.포인터;

import java.util.Scanner;

public class Q3_05 {

    private static int solution1(int[] arr, int N){
        // pe 인덱스로 배열에 있는 값을 더하고, 더한 sum값이
        // N보다 크면 pf 인덱스 배열의 값을 N 보다 작을 때까지 빼준다.
        // 위를 반복하면 아래와 같은 코드가 된다.
        int sum = 0, pf = 0, count = 0;
        for(int pe = 0; pe < N - 1; pe++){
            sum += arr[pe];
            if(sum == N)count++;
            while(sum >= N){
                sum -= arr[pf++];
                if(sum == N)count++;
            }
        }

        return count;
    }
    private static int solution2(int[] arr, int N){
        int sum = 0, pf = 0, count = 0;
        for(int pe = 0; pe < arr.length; pe++){
            sum += arr[pe];
            if(sum == N)count++;
            while(sum >= N){
                sum -= arr[pf++];
                if(sum == N)count++;
            }
        }

        return count;
    }

    //수학적 방법으로 풀기
    private static int solution3(int N){
        // 방법 : 2개 연속된 숫자일 때, N에서 1, 2를 빼고 난 나머지가 12라고 하면,
        // 12 % 2 로 나누어 떨어지면 count++ 하는 방식

        int answer = 0, count = 1;
        N--;
        while(N > 0){
            count++;
            N -= count;
            if(N % count == 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // solution1 메서드에서 사용할 배열
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = i + 1;
        }

        // solution2 메서드에서 사용할 배열
        int M = N / 2 + 1;
        int[] arr2 = new int[M];

        for(int i = 0; i < M; i++){
            arr2[i] = i + 1;
        }

        System.out.println(solution1(arr, N));
        System.out.println(solution2(arr2, N));
        System.out.println(solution3(N));
    }
}
