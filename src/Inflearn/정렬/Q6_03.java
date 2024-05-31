package Inflearn.정렬;

import java.util.Scanner;

public class Q6_03 {

    private static int[] solution1(int[] arr, int N){
        for(int i = 1; i < N; i++){
            for(int j = i - 1; j >= 0; j--){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }else{
                    break;
                }
            }
        }

        return arr;
    }

    private static int[] solution2(int[] arr, int N){
        for(int i = 1; i < N; i++){
            int temp = arr[i], j;
            for(j = i - 1; j >= 0; j--){
                if(arr[j] > temp){
                    arr[j + 1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j + 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
            arr2[i] = arr[i];
        }

        for(int num : solution1(arr, N)) System.out.print(num + " ");
        System.out.println();
        for(int num : solution2(arr2, N)) System.out.print(num + " ");
    }
}
