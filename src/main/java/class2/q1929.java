package class2;

import java.io.*;
import java.util.*;

public class q1929 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i=M; i<=N; i++) {
            if(isPrime(i)){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
    public static boolean isPrime(int num){

        if(num<2) return false;
        for(int i=2; i<=num/2;i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}