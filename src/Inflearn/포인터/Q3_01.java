package Inflearn.포인터;

import java.util.Scanner;

public class Q3_01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // 두 배열을 준비해 둔다.
        // 두 배열의 값이 오름 차순으로 정렬되어 있으므로,
        // 값을 하나씩 비교하며 출력하는 것이 좋을 것 같다.
        // 예를들어, 1과 2를 비교해서 1이 더 작으니 1을 출력하고, index1++을 한다.
        // 3과 2를 비교해서, 2를 출력하고 index2++한다. 같은 경우에도 둘중하나를 ++을 하고 계속 진행한다.

        int N = in.nextInt();
        int[] arrN = new int[N];
        for(int i = 0; i < N; i++){
            arrN[i] = in.nextInt();
        }
        int M = in.nextInt();
        int[] arrM = new int[M];
        for(int i = 0; i < M; i++){
            arrM[i] = in.nextInt();
        }

        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < M + N; i++){
            int num1 = arrN[index1];
            int num2 = arrM[index2];
            if(num1 < num2 && index1 < N){
                System.out.print(num1 + " ");
                index1++;
            } else if (index2 < M) {
                System.out.print(num2 + " ");
                index2++;
            }
        }
        return ;
    }
}
