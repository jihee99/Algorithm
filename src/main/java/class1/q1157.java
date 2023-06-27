package class1;

import java.util.Scanner;

public class q1157 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String words = sc.next().toUpperCase();

        int[] arr = new int[26];

        for(int i=0; i<words.length(); i++){
            arr[words.charAt(i)-'A']++;
        }

        int max = -1;
        char ch = '?';

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char) (i+'A');
            }
            else if(arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);

    }

}
