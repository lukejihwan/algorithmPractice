package BaekJoon;

import java.io.*;

public class Q2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;

            int change = Integer.parseInt(br.readLine());

            while(change > 0){
                if(change >= 25){
                    change = change - 25;
                    quarter++;
                } else if (change >= 10) {
                    change = change - 10;
                    dime++;
                } else if (change >= 5) {
                    change = change - 5;
                    nickel++;
                }else{
                    change = change - 1;
                    penny++;
                }
            }
            bw.write(quarter + " " + dime + " " + nickel + " " + penny + "\n");
        }

        br.close();
        bw.close();

    }
}
