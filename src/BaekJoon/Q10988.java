package BaekJoon;

import java.io.*;

public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        char[] charArray = str.toCharArray();
        int bool = 1;

        for(int i = 0; i < (str.length() / 2); i++){
            if(charArray[i] != charArray[(charArray.length - 1) - i]){
                bool = 0;
            }
        }

        bw.write(bool + "\n");
        br.close();
        bw.close();
    }
}
