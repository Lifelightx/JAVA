import java.util.Scanner;

//by sorting time complexcity will be n^2
//

public class FindSecndMin {
        
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
        int min2 = array[0];
        for(int i=0;i<size;i++){
            if(array[i]<min){
                min2 = min;
                min = array[i];
            }
            else if(min != array[i] && array[i]<min2){
                min2 = array[i];
            }
        }
        System.out.println("Minimum element of the array: "+ min);
        System.out.println("2nd Minimum element of the array: "+ min2);
    }
}
