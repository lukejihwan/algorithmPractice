package Inflearn.포인터;

import java.util.Scanner;

public class Q3_04 {

    private static int solution1(int[] arr, int N, int M){
        //sliding window로 풀기.
        //첫번째수부터 더해 나가는데, M 보다 작으면 더해나가고 일치하면 count++를한다.
        // M보다 커지면 맨앞의 수를 빼고 일치하는 것이 있으면 count++을 한다.
        // M보다 작으면 뒤의 수를 더하고, 크면 앞의 수를 빼는 식으로 진행한다.
        int count = 0, endIndex = 0, sum = 0, startIndex = 0;
        while(endIndex < N){
            if(sum < M){
                sum += arr[endIndex++];
            }else if(sum == M){
                count++;
                sum += arr[endIndex++];
            }else if(sum > M){
                sum -= arr[startIndex++];
            }
        }

        while(sum > M){
            sum -= arr[startIndex++];
            if(sum == M)count++;
        }

        return count;
    }

    private static int solution2(int[] arr, int N, int M){
        int answer = 0, sum = 0, lt = 0;

        // 로직이 수행될 때의 순서를 세심하게 볼 필요가 있다.
        // 어떤 것을 먼저 수행하고 나중에 수행할지 flow에 맞게 짜자.
        for(int rt = 0; rt < N; rt++){
            sum += arr[rt];
            if(sum == M)answer++;
            while(sum >= M){
                sum -= arr[lt++];
                if(sum == M)answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(solution1(arr, N, M));
        System.out.println(solution2(arr, N, M));
    }
}
