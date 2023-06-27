package class1;

import java.io.*;

public class q9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());
        String grade = "";
        if(score<=100 && score >=90){
            grade = "A";
        }else if(score < 90 && score >= 80){
            grade = "B";
        }else if(score < 80 && score >= 70){
            grade = "C";
        }else if(score < 70 && score >= 60){
            grade = "D";
        }else{
            grade = "F";
        }
        bw.write(grade);
        bw.flush();
        bw.close();
    }
}
