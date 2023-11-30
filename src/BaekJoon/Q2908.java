package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] firstNumArray = st.nextToken().toCharArray();
        char[] secondNumArray = st.nextToken().toCharArray();

        char firsthundred = firstNumArray[0];
        char firstone = firstNumArray[2];
        firstNumArray[0] = firstone;
        firstNumArray[2] = firsthundred;

        char secondhundred = secondNumArray[0];
        char secondone = secondNumArray[2];
        secondNumArray[0] = secondone;
        secondNumArray[2] = secondhundred;

        int first = Integer.parseInt(new String(firstNumArray));
        int second = Integer.parseInt(new String(secondNumArray));

        int result = first > second ? first : second;

        bw.write(result + "\n");
        br.close();
        bw.close();
    }
}
