package BaekJoon;

import java.io.*;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] stArray = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = br.readLine();
        int count = 0;

        for(int i = 0; i < stArray.length; i++){

            int index = str.indexOf(stArray[i]);
            while(index != -1){
                String a = str.substring(0, index);
                String b = str.substring(index + stArray[i].length());
                str = a + b;
                count++;
                index = str.indexOf(stArray[i]);
                System.out.println(a);
                System.out.println(b);

            }

        }

        int restAlphabet = str.length();
        bw.write(count + restAlphabet + "\n");
        br.close();
        bw.close();

    }
}
