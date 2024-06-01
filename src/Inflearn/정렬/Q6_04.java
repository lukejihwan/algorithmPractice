package Inflearn.정렬;

import java.util.Scanner;

public class Q6_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int ea = in.nextInt();

        int[] arr = new int[ea];
        for(int i = 0; i < ea; i++){
            arr[i] = in.nextInt();
        }

        int[] status = new int[size];
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

        for(int answer : status) System.out.print(answer + " ");

    }
}
