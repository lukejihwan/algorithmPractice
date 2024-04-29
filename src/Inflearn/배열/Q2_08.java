package Inflearn.배열;

import java.util.Scanner;

public class Q2_08 {
    private static int[] solution1(int[] arr){
        int[] answer = new int[arr.length];

        //자신보다 큰 수 만큼 count++ 해서 출력하면 됨.
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            int count = 0;
            for(int a = 0; a < arr.length; a++){
                if(num < arr[a]) count++;
            }
            answer[i] = count + 1;
        }
        return answer;
    }
    private static int[] solution2(int[] arr){
        int[] answer = new int[arr.length];

        //자신보다 큰 수 만큼 count++ 해서 출력하면 됨.
        for(int i = 0; i < arr.length; i++){
            int num = arr[i], count = 1;
            for(int a = 0; a < arr.length; a++){
                if(num < arr[a]) count++;
            }
            answer[i] = count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        for(int K : solution1(arr)){
            System.out.print(K + " ");
        }

        System.out.println();
        for(int K : solution2(arr)){
            System.out.print(K + " ");
        }

    }
}
