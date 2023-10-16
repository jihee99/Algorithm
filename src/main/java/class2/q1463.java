package class2;

import java.io.*;

public class q1463 {
    static int[] dp;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];

        dp[0] = dp[1] = 0;

        for(int i=2; i<N+1; i++){
            if((i % 3 == 0) && (i % 2 == 0)){
                dp[i] = Math.min(dp[i/3], dp[i/2]) + 1;
            } else if(i % 3 == 0){
                dp[i] = Math.min(dp[i/3], dp[i-1]) + 1;
            } else if(i % 2 == 0){
                dp[i] = Math.min(dp[i/2], dp[i-1]) + 1;
            } else{
                dp[i] = dp[i-1] + 1;
            }
        }

        bw.write(String.valueOf(dp[N]));
        bw.flush();
        bw.close();
    }

    // public int dpTopBottom(int number){
    //
    //     if((number % 3 == 0) && (number % 2 == 0)){
    //         dp[number] = Math.min(dpTopBottom(number/3)+1, dpTopBottom(number/2)+1);
    //     } else if(number % 3 == 0){
    //         dp[number] = Math.min(dpTopBottom(number/3)+1, dpTopBottom(number-1)+1);
    //     } else if(number % 2 == 0){
    //         dp[number] = Math.min(dpTopBottom(number/2)+1, dpTopBottom(number-1)+1);
    //     } else{
    //         dp[number]=dpTopBottom(number-1)+1;
    //     }
    //     return dp[number];
    // }
}
