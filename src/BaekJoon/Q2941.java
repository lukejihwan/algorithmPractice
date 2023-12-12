package BaekJoon;

import java.io.*;

public class Q2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] stArray = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = br.readLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'c'){
                if(str.charAt(i + 1) == '='){
                    i++;
                }
                else if(str.charAt(i + 1) == '-'){
                    i++;
                }
            }
            else if(ch == 'd'){
                if(str.charAt(i + 1) == 'z'){
                    if(str.charAt(i + 2) == '='){
                        i += 2;
                    }
                }
                else if(str.charAt(i + 1) == '-'){
                    i++;
                }
            }
            else if(ch == 'l') {
                if (str.charAt(i + 1) == 'j') {
                    i++;
                }
            }
            else if(ch == 'n'){
                if(str.charAt(i + 1) == 'j'){
                    i++;
                }
            }
            else if (ch == 's') {
               if(str.charAt(i + 1) == '='){
                   i++;
               }
            }
            else if(ch == 'z'){
                if(str.charAt(i + 1) == '='){
                    i++;
                }
            }

            count++;
        }

        bw.write(count + "\n");
        br.close();
        bw.close();

    }
}
