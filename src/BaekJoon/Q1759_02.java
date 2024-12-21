package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1759_02 {
    static char[] arr;
    static boolean[] visited;
    static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    static int l, c;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        l = in.nextInt();
        c = in.nextInt();
        arr = new char[c];
        visited = new boolean[c];

        for(int i = 0; i < c; i++){
            arr[i] = in.next().charAt(0);
        }

        Arrays.sort(arr);

        DFS(0, 0);

    }

    public static void DFS(int start, int level){
        if(level == l){
            String answer = "";
            for(int i = 0; i < c; i++){
                if(visited[i]) answer += arr[i];
            }

            int vowelEa = 0;
            for(int i = 0; i < l; i++){
                for(int j = 0; j < vowels.length; j++){
                    if(answer.charAt(i) == vowels[j]) vowelEa++;
                }
            }
            if(vowelEa >= 1 && (l - vowelEa) >= 2){
                System.out.println(answer);
            }
        }else{
            for(int i = start; i < c; i++){
                System.out.println(i + " 여기");
                visited[i] = true;
                DFS(i + 1, level + 1);
                visited[i] = false;
            }
        }


    }
}
