public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Jeeban");
        System.out.println(sb);

        //char at index 0;
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'A');
        System.out.println(sb);

        //insert at 
        sb.insert(0, 'S');
        System.out.println(sb);
        sb.insert(2, 'n');
        System.out.println(sb);
        
        //delete the extra n
        sb.delete(2, 3);
        System.out.println(sb);

        //append
        sb.append(4); //append an integer
        System.out.println(sb);
    
        sb.append('H');  //append an character
        sb.append(" Hello"); //append string
        System.out.println(sb);
        System.out.println(sb.length()); 
    }
}
