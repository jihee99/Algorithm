package class1;

import java.io.*;

public class q27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int idx = Integer.parseInt(br.readLine());

        System.out.println(str.charAt(idx-1));


    }
}
