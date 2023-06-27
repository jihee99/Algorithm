package class1;

import java.io.*;
import java.util.Scanner;

public class q2675 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t; i++){
            String[] str = br.readLine().split(" ");

            int count = Integer.parseInt(str[0]);
            String words = str[1];

            for(int j = 0; j<words.length(); j++){
                for(int k=0; k<count; k++){
                    bw.write(words.charAt(j));
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();



    }
}
