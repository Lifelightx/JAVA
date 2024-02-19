import java.util.Scanner;

public class FindminElement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for(int i=0; i<size;i++){
            System.out.print("Enter the element at index ["+i+"]: ");
            array[i] = sc.nextInt();
        }
        int min = array[0];
        for(int i=0;i<size;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Minimum element of the array: "+ min);

    
    }
}