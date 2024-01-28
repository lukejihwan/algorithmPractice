package BaekJoon;

import java.io.*;
import java.util.ArrayList;

public class Q9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == -1) break;
            list.clear();
            int sum = 0;

            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    list.add(i);
                    sum += i;
                }
            }

            if(sum == n){
                bw.write(n + " = " );
                for(int i = 0; i < list.size(); i++){
                    bw.write(list.get(i));
                    if(i != list.size() - 1) bw.write(" + ");
                }
                bw.write("\n");
            }else{
                bw.write(n + " is NOT perfect." + "\n");
            }

            br.close();
            bw.close();




        }

    }
}
