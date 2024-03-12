package BaekJoon;

import java.io.*;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        int[] arr = new int[K];
        int sum = 0;
        for(int i = 0; i < K; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < K; i++){
            int num = arr[i];
            if(num == 0){
                int j = i;
                while (true){
                    int targetNum = arr[j];
                    if(targetNum != 0){
                        arr[j] = 0;
                        break;
                    }
                    --j;
                }
            }
        }

        for(int i = 0; i < K; i++){
            sum += arr[i];
        }

        bw.write(sum + "\n");
        br.close();
        bw.close();

    }
}
