package class1;

import java.io.*;
import java.util.*;

public class q10998 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//
//        sb.append(a*b);
//
//        System.out.print(sb);
//
//        상단의 코드는 런타임 에러 발생
//        reader - writer 동시 사용 안됨

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A*B);
    }
}
