package class1;

import java.util.Scanner;

public class q2439 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();

        for(int i=1; i<=line; i++){
            for(int k=1; k<=line-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

