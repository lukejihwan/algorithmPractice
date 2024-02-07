package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        while(true) {
            st = new StringTokenizer(br.readLine());

            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());
            int max = 0;

            if(one == 0 && two == 0 && three == 0) break;

            max = Math.max(one, two);
            max = Math.max(max, three);
            if (max == one && (two + three <= max)) {
                bw.write("Invalid" + "\n");
            } else if (max == two && (one + three <= max)) {
                bw.write("Invalid" + "\n");
            } else if (max == three && (one + two <= max)) {
                bw.write("Invalid" + "\n");
            } else if (one == two && two == three && one == three) {
                bw.write("Equilateral" + "\n");
            } else if ((one == two && one != three) || (one == three && three != two) || (two == three && one != two)) {
                bw.write("Isosceles " + "\n");
            } else if (one != two && two != three && three != one) {
                bw.write("Scalene" + "\n");
            }

        }

        br.close();
        bw.close();

    }
}
