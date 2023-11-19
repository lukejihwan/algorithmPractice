package BaekJoon;

import java.io.*;

public class Q5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int allNum = 30;
        int array[] = new int[allNum];

        for(int i = 0; i < allNum; i++){
            array[i] = i + 1;
        }

        for(int i = 0; i < 28; i++){
            int thisNum = Integer.parseInt(br.readLine());
            for(int j = 0; j < allNum; j++){
                if(thisNum == array[j]){
                    array[j] = 0;
                }
            }
        }

        for(int i = 0; i < 30; i++){
            if(array[i] != 0){
                bw.write(array[i] + "\n");
            }
        }

        br.close();
        bw.close();
    }
}
