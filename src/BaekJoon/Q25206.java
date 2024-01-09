package BaekJoon;

import java.io.*;
import java.util.Scanner;

public class Q25206 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double result = 0, credit_sum = 0;
        char c;

        for(int i = 0; i < 20; i++) {
            double credit = 0;
            double grade = 0;

            String str_arr[] = br.readLine().split(" ");
            credit += Double.parseDouble(str_arr[1]);
            c = str_arr[2].charAt(0);

            switch(c) {
                case 'A':
                    if(str_arr[2].charAt(1) == '+') grade += 4.5;
                    else grade += 4.0;
                    break;
                case 'B':
                    if(str_arr[2].charAt(1) == '+') grade += 3.5;
                    else grade += 3.0;
                    break;
                case 'C':
                    if(str_arr[2].charAt(1) == '+') grade += 2.5;
                    else grade += 2.0;
                    break;
                case 'D':
                    if(str_arr[2].charAt(1) == '+') grade += 1.5;
                    else grade += 1.0;
                    break;
                case 'F':
                    grade += 0;
                    break;
                case 'P':
                    grade += 0;
                    credit = 0;
                    break;
            }
            credit_sum += credit;
            result += credit * grade;
        }
        br.close();

        bw.write(result/credit_sum + "\n");
        bw.close();

    }
}
