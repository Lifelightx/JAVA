import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {
        //declaration of 2d arrays

        int[][] arr = new int[2][2];

        //taking input of no of rows and no of cols
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of cols: "); 
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];
        for(int i=0;i<rows; i++){
            for(int j =0; j<cols;j++){
                System.out.print("Enter element at index ["+i+"]"+"["+j+"]: ");
                array[i][j] = sc.nextInt();
                
            }
        }
        for(int i=0;i<rows; i++){
            for(int j =0; j<cols;j++){
                System.out.print(array[i][j]+"\t");
                
            }
            System.out.println();
        }
        
    }
}
