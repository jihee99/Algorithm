package SWEA.D2;

import java.io.*;

public class q1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=loop; i++){
            String num = String.valueOf(i);

            if(num.contains("3") || num.contains("6") || num.contains("9")){
                num = num.replaceAll("[369]", "-").replaceAll("\\d","");
            }
            sb.append(num).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
