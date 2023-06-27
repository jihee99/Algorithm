package class1;

import java.io.*;
import java.util.HashSet;

public class q3052 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> h = new HashSet<>();

        for(int i=0; i<10; i++){
            String input = br.readLine();
            h.add(Integer.parseInt(input)%42);
        }
//        while(true){
//            String input = br.readLine();
//            if(input == null){
//                break;
//            }
//            System.out.println(input);
//
//            h.add(Integer.parseInt(input)%42);
//        }

        System.out.println(h.size());
    }
}
