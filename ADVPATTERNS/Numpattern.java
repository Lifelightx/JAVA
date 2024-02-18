import java.util.Scanner;

public class Numpattern {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no: ");
        int rows = sc.nextInt();

        // int num = 1;
        for(int i=1;i<=rows;i++){
            for(int j=i; j<=rows;j++){
                System.out.print(j+" ");
                
            }
            for(int k=1;k<i;k++){
                System.out.print(k+" ");
            }
            System.out.println();

        }
    }
}
