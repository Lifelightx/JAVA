import java.util.Scanner;

public class Numpattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no: ");
        int rows = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
