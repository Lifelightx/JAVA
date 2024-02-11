import java.util.Scanner;

public class Function {

    public static int averageOf3num(int num1, int num2,int num3){
        int sum = num1 + num2 + num3;
        int average = sum /3;
        return average;
    }

     public static int Printoneton(int n){
        int i,sum=0;
        for(i=1;i<=n;i++){
            sum = sum + i;
        }
        return sum;

    }
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else{
            return fibonacci(n-2)+fibonacci(n-1);
        }
    }
    public static void towerOfHonai(int disks, char source, char helper, char destination){
        if(disks==1){
            System.out.println("Move disk "+disks+" form "+source+" to "+destination);
        }
        else{
            towerOfHonai(disks-1, source, destination, helper);
            System.out.println("Move disk "+disks+" form "+source+" to "+destination);
            towerOfHonai(disks-1, helper, source, destination);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //average of three numbes
        System.out.print("Enter 1st number :");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();
        int ave = averageOf3num(num1,num2,num3);

        System.out.println("Average of three numbers: "+ave);

        System.out.print("Ente the value of n: ");
        int n = sc.nextInt();
        int nsum = Printoneton(n);
        System.out.println("Sum of n numbers: "+nsum);

        //fibonnacci series
        for(int i=0;i<n; i++){
            System.out.print(fibonacci(i)+"\t");
        }
        System.out.println();
        //towerOfHonai
        System.out.print("Enter number of disks: ");
        int disk = sc.nextInt();
        
        towerOfHonai(disk,'S','H','D');


    }
}
