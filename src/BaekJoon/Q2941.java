package BaekJoon;

import java.io.*;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'c'){
                if(i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }
            else if(ch == 'd'){
                if(i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'z') {
                        if(i < str.length() - 2){
                            if (str.charAt(i + 2) == '=') {
                                i += 2;
                            }
                        }
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }
            else if(ch == 'l') {
                if(i < str.length() - 1){
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }
            else if(ch == 'n'){
                if(i < str.length() - 1){
                    if(str.charAt(i + 1) == 'j'){
                        i++;
                    }
                }
            }
            else if (ch == 's') {
                if(i < str.length() - 1){
                    if(str.charAt(i + 1) == '='){
                        i++;
                    }
                }
            }
            else if(ch == 'z'){
                if(i < str.length() - 1){
                    if(str.charAt(i + 1) == '='){
                        i++;
                    }
                }
            }

            count++;
        }

        bw.write(count + "\n");
        br.close();
        bw.close();

    }
}
