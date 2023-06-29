package class1;

import java.io.*;
import java.util.*;

public class q10951 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null){
            st = new StringTokenizer(str," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append("\n");
        }

//        System.out.println(sb);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
