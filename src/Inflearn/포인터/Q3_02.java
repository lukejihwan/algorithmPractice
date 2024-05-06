package Inflearn.포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q3_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long[] arrN = new long[N];
        for(int i = 0; i < N; i++){
            arrN[i] = in.nextLong();
        }
        int M = in.nextInt();
        long[] arrM = new long[M];
        for(int i = 0; i < M; i++){
            arrM[i] = in.nextLong();
        }

        // 먼저 두 개의 배열을 오름 차순으로 정렬한다.
        // index1, index2 를 하나씩 ++ 하면서, 같을 때 공통배열에 추가하고 둘 다 ++ 하고,
        // 한쪽이 작으면 ++ 하며 계속해서 반복하고 한쪽의 index 가 N, M 보다 작으면 while문을 종료 한다.

        Arrays.sort(arrN);
        Arrays.sort(arrM);
        int index1 = 0;
        int index2 = 0;
        ArrayList<Long> list = new ArrayList<>();
        while(index1 < N && index2 < M){
            if(arrN[index1] == arrM[index2]){
                list.add(arrN[index1]);
                index1++;
                index2++;
            }else if(arrN[index1] < arrM[index2]){
                index1++;
            }else{
                index2++;
            }
        }

        for(long i : list){
            System.out.print(i + " ");
        }
    }
}
