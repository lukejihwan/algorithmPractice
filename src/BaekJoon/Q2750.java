package BaekJoon;

import java.io.*;

public class Q2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //여러 정렬 알고리즘 중 선택정렬을 사용하여 풀어 보겠다.

        int rep = Integer.parseInt(br.readLine());
        int[] arr = new int[rep];

        for(int i = 0; i < rep; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] resultArr = sort(arr);

        for(int i = 0; i < rep; i++){
            bw.write(resultArr[i] + "\n");
        }

        br.close();
        bw.close();

    }

    private static int[] sort(int[] arr){
        int a = arr[0];

        for(int i = 0; i < arr.length; i++){
            int index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        return arr;
    }
}
