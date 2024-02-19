import java.util.Scanner;

public class FindtheHighele {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index [" + i + "]: ");
            array[i] = sc.nextInt();
        }

        int max = array[0];
        for(int i=0;i<size;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Maximum of element of the array: "+max);
    }
}
