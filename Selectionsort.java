import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int i,j;
        int[] array = new int[size];
        for(i=0;i<size;i++){
            System.out.print("Enter element at index["+i+"]: ");
            array[i] = sc.nextInt();
            
        }

        //selection sort

        for(i=1;i<size;i++){
            int smallest = i;
            for(j=i+1;j<i;j++){
                if(array[smallest]>array[j]){
                    smallest =j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
        for(i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
}
