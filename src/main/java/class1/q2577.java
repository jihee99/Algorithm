package class1;

import java.io.*;
import java.util.stream.*;


public class q2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        int a = Integer.parseInt( br.readLine());
        int b = Integer.parseInt( br.readLine());
        int c = Integer.parseInt( br.readLine());

        int res = a*b*c;

        int[] digits = Stream.of(String.valueOf(res).split("")).mapToInt(Integer::parseInt).toArray();
        int[] count = new int[10];

        for (int digit : digits) {


            count[digit]++;
        }

        for (int j : count) {
            bw.write(String.valueOf(j));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
