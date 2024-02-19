import java.util.Scanner;

public class FuntoSum {

    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int size = sc.nextInt();
        int sum = 0;
        System.out.print("Enter numbers for sum: ");
        for(int i=0; i<size;i++){
            System.out.print(" ");
            int num = sc.nextInt();
            sum = sum + num;
        }
        System.out.println("sum = "+sum);
    }
    public static void main(String[] args) {
        sum();
    }
}
