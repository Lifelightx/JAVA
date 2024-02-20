import java.util.Scanner;

public class Sumofnum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        int ans = 0;

        for(int i=1; i<=terms; i++){
            if(i%2 == 0){
                ans = ans -i;
            }
            else{
                ans = ans +i;
            }
        }
        System.out.println("Ans is: "+ans);
    }
}
