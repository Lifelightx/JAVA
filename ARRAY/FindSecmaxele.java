import java.util.Scanner;

public class FindSecmaxele {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index [" + i + "]: ");
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int nd_max = array[0];
        for(int i=0; i<size;i++){
            if(array[i]>max){
                nd_max = max;
                max = array[i];
            }
            else if(array[i]>nd_max && array[i] != max){
                nd_max = array[i];
            }
        }

        System.out.println("Max element of the arrray: "+max);
        System.out.println("second Max element of the arrray: "+nd_max);
    }
}
