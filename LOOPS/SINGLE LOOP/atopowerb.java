import java.util.Scanner;

public class atopowerb {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int b = sc.nextInt();

        int power =1;
        for(int i=1; i<=b;i++){
            power = power*a;
        }
        System.out.println("Power is: "+power);
    }
}
