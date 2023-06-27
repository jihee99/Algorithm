package class1;

import java.io.*;

public class q8958 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i=0; i < count; i++){
            String input = br.readLine();
            int score = 0;
            int result = 0;
            for(int j=0; j<input.length(); j++){
                String ch = String.valueOf(input.charAt(j));
                if(input.charAt(j) == 'O'){
                    score ++;
                    result += score;
                }else if(input.charAt(j) == 'X'){
                    score = 0;
                }
            }
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
