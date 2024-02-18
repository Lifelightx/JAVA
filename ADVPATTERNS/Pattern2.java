// package ADVPATTERNS;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of row: ");
        int h = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int w = sc.nextInt();
        for(int i=0; i<=h;i++){
            for(int j=0; j<=w;j++){
                if(i==0 ||j==0 || i==h ||j==w ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
