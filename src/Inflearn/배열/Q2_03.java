package Inflearn.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_03 {

    private static ArrayList<String> solution1(int N, int[] aArr, int[] bArr){
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            int H = aArr[i];
            int K = bArr[i];
            if(H == 1 && K ==2){
                list.add("B");
            }else if(H == 1 && K == 3){
                list.add("A");
            }else if(H == 2 && K == 1){
                list.add("A");
            }else if(H == 2 && K == 3){
                list.add("B");
            }else if(H == 3 && K == 1){
                list.add("B");
            }else if(H == 3 && K == 2){
                list.add("A");
            }else{
                list.add("D");
            }
        }

        return list;
    }

    private static String solution2(int N, int[] aArr, int[] bArr){
        String answer = "";

        for(int i = 0; i < N; i++){
            int K = aArr[i];
            int H = bArr[i];
            if(K == H) answer += "D";
            else if (K == 1 && H == 3) answer += "A";
            else if (K == 2 && H == 1) answer += "A";
            else if (K == 3 && H == 2) answer += "A";
            else answer += "B";
        }

        return answer;
    }

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
        for(String N : solution1(count, aArr, bArr)){
            System.out.println(N);
        }
        for(char N : solution2(count, aArr, bArr).toCharArray())System.out.println(N);



    }
}
