package class2;

import java.io.*;

public class q1018 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);


        // m, n 크기를 잘라서 8*8 크기의 체스판으로 만ㄷㅁ

        boolean[][] arr = new boolean[N][M];
//        String[][] arr = new String[r][c];
        for(int i=0; i<N; i++){
            String[] s = br.readLine().split("");
            for(int j=0; j<M; j++){
                if(s[j].equals("W")){
                    arr[i][j] = true;
                }else{
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;

        for(int i=0; i<N_row; i++){
            for(int j=0; j<M_col; i++){

                int NN =;
                int MM;

            }
        }

    }
}

