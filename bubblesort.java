import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size,i,j;
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        int[] array1 = new int[size];
        for( i=0;i<size;i++){
            System.out.print("Enter elemnt of arrya at index["+i+"]: ");
            array1[i] = sc.nextInt();
        }
        System.out.println("Unsorted array:");
        for(i=0;i<size;i++){
            System.out.println(array1[i]);
        }
        //bubble sort
        for( i=0; i<size-1;i++){
            for( j=0;j<size-1-i;j++){
                if(array1[j]>array1[j+1]){
                    int temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp;
                    
                }
            }

        }
        for(i=0; i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }


    }
}
