import java.util.Scanner;

public class TraverseofTwodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int cols = sc.nextInt();

        int[][] array = new int[rows][cols];
        int i;
        int j;
        for(i=0;i<rows;i++){ 
            for(j=0;j<cols;j++){
                System.out.print("Enter Element at index ["+i+"]"+"["+j+"]: ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element: ");
        int reqelement = sc.nextInt(); 
        
        for(i = 0; i<rows; i++){
            for(j=0;j<cols;j++){
                if(array[i][j] == reqelement){
                    System.out.println("Element found at index ["+i+"]"+"["+j+"]");

                }
            }
        }
        
    }
}
