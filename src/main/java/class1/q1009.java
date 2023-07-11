package class1;

import java.io.*;
import java.util.StringTokenizer;

public class q1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int exp = Integer.parseInt(st.nextToken());


            int gob = 1;
            for(int j = 1; j <= exp; j++){
                gob = (gob*num)%10;
            }

            if(gob == 0) gob = 10;

            bw.write(String.valueOf(gob));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
