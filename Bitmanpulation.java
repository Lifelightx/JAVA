public class Bitmanpulation {
    public static void main(String[] args) {
        int n =5;//101
        int pos = 2;
        int bitmask = 1<<pos;
        //get bit
        if((bitmask & n)== 0){
            System.out.println("Bit was zero.");

        }
        else{
            System.out.println("Bit was one.");
        }

        //set bit

        int num = 4;
        pos = 1;
        bitmask = 1<<pos;
        int newnum = bitmask | num;
        System.out.println("setbit: "+newnum);

        //clear bit
        num = 6;
        pos = 1;
        bitmask = 1<<pos;
        int notbitmask = ~(bitmask);

        newnum = notbitmask & num;
        System.out.println(newnum);
    }
}
