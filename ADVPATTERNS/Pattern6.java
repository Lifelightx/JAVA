import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no: ");
        int rows = sc.nextInt();

        for (int i = 1, k = 0; i <= rows; ++i, k = 0) {
            for (int s = 1; s <= rows - i; ++s) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println("");
        }
    }
}
