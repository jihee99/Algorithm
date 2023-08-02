package class2;

//9 8
//CCTGGATTG
//2 0 1 1
//
//4 2
//GATA
//1 0 0 1


import java.io.*;
import java.util.StringTokenizer;

public class q12891 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String dna = br.readLine();
        st = new StringTokenizer(br.readLine());

        int[] rules = new int[P];

        int chkA = Integer.parseInt(st.nextToken());
        int chkC = Integer.parseInt(st.nextToken());
        int chkG = Integer.parseInt(st.nextToken());
        int chkT = Integer.parseInt(st.nextToken());

        for(int i=0; i<4; i++){
//            CCTGGATTG
            rules[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<S-P+1; i++){
            int end = i+P;
            String chkStr = dna.substring(i, end);


//            for(int j=0; j<chkStr.length(); j++){
//                char ch = chkStr.charAt(j);
//                if (ch)
//                if(ch == 'a')
//                System.out.println(chkStr.charAt(j));
//            }
            System.out.println(chkStr);
        }
    }

    public static int countChar(String str, char ch){
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }
}
