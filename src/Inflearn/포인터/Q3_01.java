package Inflearn.포인터;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3_01 {

    private static ArrayList<Integer> solution1(int[] arrN, int[] arrM, int N, int M)
    {
        ArrayList<Integer> list = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < M + N; i++){
            int num1 = arrN[index1];
            int num2 = arrM[index2];
            if(num1 < num2 && index1 < N){
                list.add(num1);
                index1++;
            } else if (num1 >= num2 && index2 < M) {
                list.add(num2);
                index2++;
            }
        }

        return list;
    }

    private static ArrayList<Integer> solution2(int[] arrN, int[] arrM, int N, int M)
    {
        ArrayList<Integer> list = new ArrayList<>();

        int pn = 0;
        int pm = 0;
        while (pn < N && pm < M){
            if(arrN[pn] < arrM[pm]){
                list.add(arrN[pn]);
                pn++;
            }else {
                list.add(arrM[pm]);
                pm++;
            }
        }
        while (pn < N){
            list.add(arrN[pn]);
            pn++;
        }
        while (pm < M){
            list.add(arrM[pm]);
            pm++;
        }
        return list;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // 두 배열을 준비해 둔다.
        // 두 배열의 값이 오름 차순으로 정렬되어 있으므로,
        // 값을 하나씩 비교하며 출력하는 것이 좋을 것 같다.
        // 예를들어, 1과 2를 비교해서 1이 더 작으니 1을 출력하고, index1++을 한다.
        // 3과 2를 비교해서, 2를 출력하고 index2++한다. 같은 경우에도 둘중하나를 ++을 하고 계속 진행한다.

        int N = in.nextInt();
        int[] arrN = new int[N + 1];
        for(int i = 0; i < N; i++){
            arrN[i] = in.nextInt();
        }
        int M = in.nextInt();
        int[] arrM = new int[M + 1];
        for(int i = 0; i < M; i++){
            arrM[i] = in.nextInt();
        }

        for(int res : solution1(arrN, arrM, N, M)){
            System.out.print(res + " ");
        }
        System.out.println();
        for(int res : solution2(arrN, arrM, N, M)){
            System.out.print(res + " ");
        }
    }
}
