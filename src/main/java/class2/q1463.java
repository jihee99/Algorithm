package class2;

import java.io.*;

public class q1463 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while(N > 1){
            if(N%3 == 0) N = N/3;
            else if((N-1) % 3 == 0) N = N-1;
            else if(N%2 == 0) N = N/3;
            else N = N - 1;

            count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
