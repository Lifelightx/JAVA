public class Arrarydeclaration {
    public static void main(String[] args) {
        int[] array = {2,3,4,4};
        array[0] = 23; //update array values
        System.out.println(array[0]);

        byte[] array1 = {2,34,56,67,12};

        float[] array2 = {2.3f, 2.4f, 3.5f, 3.8f};

        short[] shortArray = {2,3,4,5,0};
        boolean[] bolleanArray = {true,false};
        char[] charArray = {'a','b','C','D'};
        double[] doubleAray = {23.23, 45.12, 45.12};

        //single dimensional arrays
        String[] colours = {"Green", "Red", "Yellow", "Orange", "Pink"};

        int size = colours.length;
        for(int i=0; i<size; i++){
            System.out.println(colours[i]);
        }

        //for each loop in array
        System.out.println("For each loop: ");
        for(String a: colours){
            System.out.println(a);
        }

        //multi dimensional array
        int[][] multidimArray = {{1,2,3},{4,5,6,},{7,8,9}};

        System.out.println(multidimArray[0][0]);
        System.out.println(multidimArray[0][1]);
        System.out.println(multidimArray[0][2]);
        System.out.println(multidimArray[1][0]);

    }
}
