package class1;

import java.io.*;

public class q2739 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        for(int i=1; i<=9; i++){
            bw.write(a+" * "+i+" = "+a*i);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

}
