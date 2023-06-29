package class1;

import java.io.*;

public class q10950 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for(int i=0; i<count; i++){
            String[] str =  br.readLine().split(" ");

            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);

            bw.write(String.valueOf(A+B));
            bw.newLine();

        }
        bw.flush();
        bw.close();
    }

}
