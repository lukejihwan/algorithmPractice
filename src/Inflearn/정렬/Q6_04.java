package Inflearn.정렬;

import java.util.Scanner;

public class Q6_04 {
    private static int[] solution1(int N, int K, int[] arr){
        int[] status = new int[N];
        for(int key : arr){
            boolean flag = false;
            int index = -1;
            for(int i = 0; i < status.length; i++){
                if(key == status[i]){
                    flag = true;
                    index = i;
                    break;
                }
            }
            if(flag){
                for(int i = index; i > 0; i--){
                    status[i] = status[i - 1];
                }
                status[0] = key;
            }else{
                for(int i = status.length - 1; i > 0; i--){
                    status[i] = status[i - 1];
                }
                status[0] = key;
            }
        }

        return status;
    }

    private static int[] solution2(int N, int K, int[] arr){
        int[] cache = new int[N];

        for(int num : arr){
            int pos = -1;
            for(int i = cache.length - 1; i >= 1; i--){
                if(num == cache[i]) pos = i;
            }
            if(pos == -1){
                for(int i = cache.length - 1; i >= 1; i--){
                    cache[i] = cache[i - 1];
                }
            }else{
                for(int i = pos; i >= 1; i--){
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = num;
        }

        return cache;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int ea = in.nextInt();

        int[] arr = new int[ea];
        int[] arr2 = new int[ea];
        for(int i = 0; i < ea; i++){
            arr[i] = in.nextInt();
            arr2[i] = arr[i];
        }

        for(int answer : solution1(size, ea, arr)) System.out.print(answer + " ");
        for(int answer : solution2(size, ea, arr2)) System.out.print(answer + " ");

    }
}
