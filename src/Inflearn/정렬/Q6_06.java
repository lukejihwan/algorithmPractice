package Inflearn.정렬;

import java.util.Scanner;

public class Q6_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

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
    }
}
