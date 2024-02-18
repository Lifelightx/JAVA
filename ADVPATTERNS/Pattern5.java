import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no: ");
        int h = sc.nextInt();

        //pattern
        for(int i=0;i<h;i++){
            for(int j=h;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
