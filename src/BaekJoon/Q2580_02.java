package BaekJoon;

import java.util.Scanner;

public class Q2580_02 {
    static int[][] map;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        map = new int[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                map[i][j] = in.nextInt();
            }
        }

        solution(0, 0);
    }

    public static void solution(int y, int x){
        if(x == 9){
            solution(y + 1, 0);
            return;
        }

        if(y == 9){
            print();
            System.exit(0);
        }

        // 주의 : 먼저 거친 (0,0) 이 1로 들어갔다고 하고, (0,1)로 2가 통과되어 넘어갔다고 하고
        // (0,2)로 넘어갔을 때, 유효한 숫자가 한개도 없다고 하면, 현재(0,2)자리가 문제가 아니라
        // 이전 자리에 문제가 있다고 가정하고 뒤로 이전 자리(0,1)로 돌아간다(stack에 쌓여있음)
        // (0,1)에서 어떤 숫자도 안맞다고 하면 임시로 넣어봤던 숫자를 0으로 초기화하고 (0,0)으로
        // 넘어가서 처음에 넣었던 1 다음인 숫자 2를 넣어서 계속해서 진행한다
        if(map[y][x] == 0){
            for(int i = 1; i <= 9; i++){
                if(validation(y, x, i)){
                    map[y][x] = i;
                    solution(y, x + 1);
                }
            }
            map[y][x] = 0;
            return;
        }

        solution(y, x + 1);
    }

    public static boolean validation(int y, int x, int value){
        for(int i = 0; i < 9; i++){
            if(map[y][i] == value){
                return false;
            }
            if(map[i][x] == value){
                return false;
            }
        }

        int startX = x/3 * 3;
        int startY = y/3 * 3;

        for(int i = startY; i < startY + 3; i++){
            for(int j = startX; j < startX + 3; j++){
                if(map[i][j] == value){
                    return false;
                }
            }
        }

        return true;
    }

    public static void print(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
