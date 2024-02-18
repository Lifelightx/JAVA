import java.util.Scanner;

public class Numpattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no: ");
        int rows = sc.nextInt();
        System.out.print("Enter row no: ");
        int cols = sc.nextInt();

        for(int i=1 ; i<=rows; i++){
            for(int j=1;j<=cols; j++){
                if(j==1 || i== rows || i==1 || j==cols){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
