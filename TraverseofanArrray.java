import java.util.Scanner;

public class TraverseofanArrray {
    public static void main(String[] args){
        int size,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrray: ");
        size = sc.nextInt();
        int[] array = new int[size];
        for(i=0;i<size;i++){
            System.out.print("Enter Element at index["+i+"]: ");
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the element: ");
        int reqelement = sc.nextInt();
        for(i = 0; i<size;i++){ 
            if(array[i] == reqelement){
                System.out.println("The element found at index ["+i+"].");
                break;
            }
        }
    }
}
