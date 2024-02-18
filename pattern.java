import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int i,j;
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        rows = sc.nextInt();
        for(i=0;i<rows;i++){
            int num =1;
            for(j=0;j<rows-1-i;j++){
             System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;

            }
            System.out.println();
            
        }
    }
}
