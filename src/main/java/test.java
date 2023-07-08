import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {

//    Q2562
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] arr = new int[9];
//        int idx = 0;
//
//        for(int n : arr){
//            arr[idx] = Integer.parseInt(br.readLine());
//            idx++;
//        }
//
//        int max = -999;
//        int n = 0;
//
//        for(int i=0; i<arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                n = i+1;
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(n);
//
//    }

//    Q1152
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] arr = br.readLine().trim().split(" ");
//
//        System.out.println(arr.length);
//    }


//    Q1546
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        double[] arr = new double[count];

        for(int i=0; i<count; i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(arr);

        double max = arr[arr.length - 1];

        double ave = 0;
        for(double d :arr){
            ave += (double) d/max*100;
        }

        System.out.println();
        System.out.println( ave/count);

    }

}