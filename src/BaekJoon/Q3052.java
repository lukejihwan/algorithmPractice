package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Q3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[10];

        for(int i = 0; i < 10; i++){
            array[i] = Integer.parseInt(br.readLine()) % 42;
        }
        //1번 방법
        Arrays.sort(array);
        int count = 1;
        for(int i = 0; i < 9; i++){
            if(array[i] != array[i+1]) count++;
        }

        //2번 방법
        /*HashSet<Integer> remainders = new HashSet<>();
        for(int i = 0; i < 10; i++){
            int number = Integer.parseInt(br.readLine());
            remainders.add(number % 42);
        }
        bw.write(remainders.size() + "\n");*/

        bw.write(count + "\n");
        br.close();
        bw.close();
    }
}
