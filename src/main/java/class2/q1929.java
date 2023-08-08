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

        boolean arr[] = new boolean[N+1];
        arr[0] = arr[1] = true;

        int sqrt = (int)Math.sqrt(N);
        for(int i=2; i<=sqrt; i++) {
            for(int j=2; j<=N/i; j++) {
                if(arr[i*j] == true) {
                    continue;
                }
                else  {
                    arr[i*j] = true;
                }
            }
        }


        for(int i=M; i<=N; i++) {
            if(arr[i] == false) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
//    public static boolean isPrime(int num){
//
//        if(num<2) return false;
//        for(int i=2; i<=num/2;i++){
//            if(num%i == 0) return false;
//        }
//        return true;
//    }
}