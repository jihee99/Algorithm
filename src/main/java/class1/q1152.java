package class1;

import java.util.*;

public class q1152 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String trimStr = str.trim();
        if(trimStr.length()>0){
            String[] arr = str.trim().split(" ");
            System.out.println(arr.length);
        }else{
            System.out.println("0");
        }
//        System.out.print(str.trim());
//        String[] arr = str.trim().split(" ");
//
//        System.out.println(arr.length);
    }
}


