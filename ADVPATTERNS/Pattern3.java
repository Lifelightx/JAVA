

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int h = sc.nextInt();
        System.out.print("Enter no of cols: ");
        int w = sc.nextInt();
        int i,j;
        for(i=0;i<h;i++){
            for(j=0;j<w;j++){
                System.out.print("*");
                System.out.print(".");
            }
            System.out.println();
        }

    }
}
