package class1;

import java.io.*;

public class q2884 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] numbers = input.split(" ");
        int hour = Integer.parseInt(numbers[0]);
        int min = Integer.parseInt(numbers[1]);

        if((0 <= hour && hour <= 23) && (0 <= min && min <= 59)){
            if(min<45){
                min = min+60-45;
                hour--;
                if(hour<0){
                    hour = hour+24;
                }
            }else{
                min = min-45;
            }

        }

        bw.write(hour + " " + min);

        bw.flush();
        bw.close();

    }
}
