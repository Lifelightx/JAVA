import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sm = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userinput = sc.nextLine();
        sm.append(userinput);
    for(int i=0;i<sm.length()/2;i++){
        int front = i;
        int back = sm.length()-1-i;
        char frontchar = sm.charAt(front);
        char backchar = sm.charAt(back);
        sm.setCharAt(front, backchar);
        sm.setCharAt(back, frontchar);
    }
    System.out.println(sm);

        
        
    }
}
