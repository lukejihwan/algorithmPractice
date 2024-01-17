package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q11005ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int radix = Integer.parseInt(st.nextToken());

        List<Character> list = new ArrayList<>();

        while(number > 0){
            if(number % radix < 10){
                list.add((char) (number % radix + '0'));
            }else{
                list.add((char) (number % radix - 10 + 'A'));
            }
            number /= radix;
        }

        for(int i = list.size() - 1; i >= 0; i--){
            bw.write(list.get(i));
        }

        br.close();
        bw.close();
    }
}
