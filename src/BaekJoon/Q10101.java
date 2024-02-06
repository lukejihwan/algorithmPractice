package BaekJoon;

import java.io.*;

public class Q10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstAngle = Integer.parseInt(br.readLine());
        int secondAngle = Integer.parseInt(br.readLine());
        int thirdAngle = Integer.parseInt(br.readLine());

        int totalAngle = firstAngle + secondAngle + thirdAngle;

        if(firstAngle == 60 && secondAngle == 60 && thirdAngle == 60){
            bw.write("Equilateral" + "\n");
        } else if (totalAngle == 180 && firstAngle != secondAngle && firstAngle != thirdAngle && secondAngle != thirdAngle) {
            bw.write("Scalene" + "\n");
        } else if (totalAngle != 180) {
            bw.write("Error" + "\n");
        } else if (totalAngle == 180 && (firstAngle == secondAngle || firstAngle == thirdAngle || secondAngle == thirdAngle)){
            bw.write("Isosceles" + "\n");
        }

        br.close();
        bw.close();

    }
}
