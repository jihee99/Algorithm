package class1;

import java.io.*;

public class q10869 {

    public static void main(String[] args) throws IOException {
//        두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);

        bw.write(String.valueOf(A+B));
        bw.newLine();

        bw.write(String.valueOf(A-B));
        bw.newLine();

        bw.write(String.valueOf(A*B));
        bw.newLine();

        bw.write(String.valueOf(A/B));
        bw.newLine();

        bw.write(String.valueOf(A%B));
        bw.newLine();

        bw.flush();
        bw.close();

    }
}
