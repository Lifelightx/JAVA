import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (i = 0; i < size; i++) {
            System.out.print("Enter element at index [" + i + "]: ");
            array[i] = sc.nextInt();
        }
        int search_ele;
        System.out.print("Enter the element for search: ");
        search_ele = sc.nextInt();
        int min = 0;
        int max = size - 1;
        int result = -1;

        while (min <= max) {
            int mid = min + (max - min) / 2; // Corrected calculation for mid
            if (search_ele > array[mid]) {
                min = mid + 1;
            } else if (search_ele < array[mid]) {
                max = mid - 1;
            } else {
                result = mid;
                break; // Added break statement when element is found
            }
        }
        System.out.println("Result index: " + result);
    }
}
