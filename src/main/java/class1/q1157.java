package class1;
import java.util.*;

public class q1157 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String words = sc.next().toUpperCase();

        int[] arr = new int[26];

//        char a = 0;
//        int maxCount = 0;
//        int count = 0;
//        int len = words.length();
//
//        if(len == 1){
//            System.out.println(words);
//        }else{
//            for(int i=0; i<len; i++){
//                count = 0;
//                for(int j=i+1; j<len; j++){
//                    if(words.charAt(i) == words.charAt(j)){
//                        count++;
//                        if(count > maxCount){
//                            maxCount = count;
//                            a = words.charAt(j);
//                        }else if(count == maxCount){
//                            a = '?';
//                        }
//                    }
//                }
//
//
//            }
//            System.out.println(arr);
//        }

        int max = -1;
        char ch = '?';

        for(int i=0; i<words.length(); i++){
            arr[words.charAt(i)]++;
        }

        for(int i=0;i<=arr.length; i++){


        }


    }

}
