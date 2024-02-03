package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //3점중에, 같은 x가 2개, 같은 y가 2개이다.
        //나머지, x와 y가 곧 나머지 점이다.

        StringTokenizer st = null;
        String[] x = new String[3];
        String[] y = new String[3];

        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            x[i] = st.nextToken();
            y[i] = st.nextToken();
        }

        String resultX = null;
        String resultY = null;

        if(x[0].equals(x[1])){
            resultX = x[2];
        } else if (x[0].equals(x[2])) {
            resultX = x[1];
        } else if (x[1].equals(x[2])) {
            resultX = x[0];
        }

        if(y[0].equals(y[1])){
            resultY = y[2];
        } else if (y[0].equals(y[2])) {
            resultY = y[1];
        } else if (y[1].equals(y[2])) {
            resultY = y[0];
        }

        bw.write(resultX + " " + resultY + "\n");
        br.close();
        bw.close();
    }
}
