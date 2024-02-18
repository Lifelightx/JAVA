public class insertinganelement {
    public class Main {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int size = 5; // Current size of the array
            int index = 2; // Index at which to insert
            int element = 10; // Element to insert
    
            // Shift elements to the right to make space for the new element
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            // Insert the element
            arr[index] = element;
            size++; // Increment size since we added an element
    
            // Print the array after insertion
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
    