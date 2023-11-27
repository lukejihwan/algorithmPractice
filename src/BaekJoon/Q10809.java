package BaekJoon;

import java.io.*;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        for (int i = 0; i < 26; i++){
            boolean flag = true;
            char alpabet = (char) (97 + i);

            for(int j = 0; j < word.length(); j++){
                if(word.charAt(j) == (alpabet)){
                    bw.write(j + " ");
                    flag = true;
                    break;
                }else{
                    flag = false;
                }

            }
            if(flag == false) bw.write("-1" + " ");

        }

        bw.write("\n");
        br.close();
        bw.close();
    }
}
