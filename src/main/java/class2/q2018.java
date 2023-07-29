package class2;

import java.io.*;

public class q2018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        System.out.println(N);
        int start = 1, end = 1, count =1, sum = 1;

        while(end != N){

            if(sum == N){
                count++;
                end++;
                sum = sum + end;
            }else if(sum < N){
                end++;
                sum = sum + end;
            }else if(sum > N){
                sum = sum - start;
                start++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();


    }
}
