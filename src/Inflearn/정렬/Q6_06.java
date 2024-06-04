package Inflearn.정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q6_06 {
    private static ArrayList<Integer> solution1(int[] arr, int N){
        ArrayList<Integer> list = new ArrayList<>();
        // 아래 케이스 외에 철수가 주변아이들과 키가 같은 경우도 존재하므로, 추가해야함
        boolean firstPrinted = false;
        for(int i = 0; i < N - 1; i++){
            if(arr[i] > arr[i + 1] && !firstPrinted){
                System.out.print(i + 1 + " ");
                firstPrinted = true;
            }else if(arr[i] > arr[i + 1] && firstPrinted){
                System.out.print(i + 2 + " ");
            }
        }
        return list;
    }

    private static ArrayList<Integer> solution2(int[] arr, int N){
        ArrayList<Integer> answer = new ArrayList<>();

        int[] temp = arr.clone();
        Arrays.sort(temp);
        for(int i = 0; i < N; i++){
            if(arr[i] != temp[i]){
                answer.add(i + 1);
            }
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

        for(int answer : solution2(arr, N)){
            System.out.print(answer + " ");
        }

    }
}
