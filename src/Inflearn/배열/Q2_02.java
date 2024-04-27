package Inflearn.배열;

import java.util.Scanner;

public class Q2_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //첫번째 학생의 키를 저장하고, count + 1 을 한다.
        //그 다음 저장된 키보다 작으면 무시하고, 저장된 키보다 크면 count + 1 하고,
        //변수에 저장한다. 끝까지 반복한다.

        int N = in.nextInt();
        int[] intArr = new int[N];
        for(int i = 0; i < N; i++){
            intArr[i] = in.nextInt();
        }
        int tallOne = intArr[0];
        int count = 1;
        for(int i = 1; i < N; i++){
            if(tallOne < intArr[i]){
                count++;
                tallOne = intArr[i];
            }
        }

        System.out.println(count);
    }
}
