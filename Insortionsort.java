import java.util.Scanner;

public class Insortionsort {
    public static void main(String[] args) {
        int size,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrray: ");
        size = sc.nextInt();
        int[] array = new int[size];
        for(i=0;i<size;i++){
            System.out.print("Enter Element at index["+i+"]: ");
            array[i] = sc.nextInt();
        }

        //loop for passes
        for(i =1;i<size-1;i++){
            // loop for each pass
            int key = array[i];
            int j = i-1;
            while (array[j]<key && j>=0) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;

        }
        for(i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
}
