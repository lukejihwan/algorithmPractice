package Inflearn;

import java.util.Scanner;

public class Q2_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        //가위바위보 횟수를 변수로 받는다.
        // A의 정보를 배열에 담는다.
        // B의 정보를 배열에 담는다.
        // A, B배열을 횟수만큼 비교한다.
        // A를 기준으로 비교하여 이긴 사람을 출력한다.
        int[] aArr = new int[count];
        int[] bArr = new int[count];
        for(int i = 0; i < count; i++){
            aArr[i] = in.nextInt();
        }
        for(int i = 0; i < count; i++){
            bArr[i] = in.nextInt();
        }

        for(int i = 0; i < count; i++){
            int N = aArr[i];
            int K = bArr[i];
            if(N == 1 && K ==2){
                System.out.println("B");
            }else if(N == 1 && K == 3){
                System.out.println("A");
            }else if(N == 2 && K == 1){
                System.out.println("A");
            }else if(N == 2 && K == 3){
                System.out.println("B");
            }else if(N == 3 && K == 1){
                System.out.println("B");
            }else if(N == 3 && K == 2){
                System.out.println("A");
            }else{
                System.out.println("D");
            }
        }
    }
}
