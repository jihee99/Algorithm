package SWEA.D2;

import java.io.*;
import java.util.Arrays;


public class q2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] pascal = new int[N+1][N+1];


        for(int i=0; i<pascal.length; i++){
            Arrays.fill(pascal[i], 0);
        }

        pascal[1][1] = 1;

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                pascal[i][j] = pascal[i][j-1] + pascal[i-1][j];
            }

        }

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i+1; j++){
                sb.append(pascal[i][j]).append(" ");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
