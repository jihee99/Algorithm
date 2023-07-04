package class2;

import java.io.*;
import java.util.*;

public class q1018 {

    public static int min = 64;
    public static boolean[][] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // m, n 크기를 잘라서 8*8 크기의 체스판으로 만ㄷㅁ
        arr = new boolean[N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                if(str.charAt(j) == 'W') {
                    // white 일 경우  -> true
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;

        for(int i=0; i<N_row; i++){
            for(int j=0; j<M_col; j++){
                check(i,j);
            }
        }
        System.out.println(min);
    }

    static void check(int x, int y){
        int end_x = x+8;
        int end_y = y+8;
        int count = 0;

        boolean check = arr[x][y];

        for(int i=x; i<end_x; i++){
            for (int j = y; j < end_y; j++) {
                if(arr[i][j] != check) {
                    count++;
                }
                check = !check;
            }
            check = !check;
        }
        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}

