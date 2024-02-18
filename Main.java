import java.util.Scanner;



public class Main {

    public static void myFunc(){
        System.out.println("Inside my function");
    }
    
    public static  void main(String[] args) {
        System.out.println("Hello, world!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        


        int res = num * num;
        System.out.println("Res: "+res);
        myFunc();
    }
} 
