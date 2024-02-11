import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        //defining an array
        int[] arr = {2,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        } 
        int[] newarr1 = new int[3];
        newarr1[0] = 23;
        newarr1[1] = 34;
        newarr1[2] = 75; 
        // System.out.println(newarr1[0]);
        // System.out.println(newarr1[1]);
        // System.out.println(newarr1[2]);
        for(int i=0;i<3;i++){
            System.out.println(newarr1[i]);
        }
        //taking input size from user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        for(int i=0; i<size; i++){
            System.out.printf("%d index: ",i);
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            System.out.print(arr1[i]+"\t");
        }
        
    }
}
