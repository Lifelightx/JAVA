public class ProblemOnArray {

    public static void main(String[] args) {
        
        //01.sum of elements
        int[] arr = {24, 21, 34};

        int sum = 0; 
        for(int a: arr){
            sum = sum+a;
        }
        System.out.println("sum of the elements of the array: "+sum);


        //search a given element is present or not

        float[] array = {2.3f, 3.4f, 3, 3.5f, 6.7f};
        float search_ele = 3;
        for(int i=0; i<array.length;i++){
            if(search_ele == array[i]){
                System.out.println("position at which the element is present: "+i);
            }
        }
    }
}