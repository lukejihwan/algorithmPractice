package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        while((str = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(str);
            int firstNum = Integer.parseInt(st.nextToken());
            int secondNum = Integer.parseInt(st.nextToken());
            bw.write(firstNum + secondNum + "\n");
        }
        br.close();
        bw.close();
    }
}
