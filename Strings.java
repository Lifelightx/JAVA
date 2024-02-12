import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        
        //string declaration
        String name = "jeeban";

        String fullName = "Jeebanjyoti";
        String sureName = " Mallik";
        String sentence = "please pay my money";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a your name: ");
        String newname = sc.nextLine(); //if we use next() then single word can be input
        System.out.println("your name is: "+newname);
        //concatenation
        String myName = fullName + sureName;
        System.out.println(myName);
        System.out.println(myName.length()); //length of string

        //charAt
        for(int i=0; i<myName.length(); i++){
            System.out.print(myName.charAt(i)+"\t");
        }
        System.out.println();
        //comparestring
        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1< s2 : -ve value
        String name1 = "Fitendra";
        String name2 = "ZAbhijit";
        if(name1.compareTo(name2) == 0){
            System.out.println("String are equal.");
        }
        else if(name1.compareTo(name2) > 0){
            System.out.println("Name1 is greater.");
        }
        else{
            System.out.println("Name2 is Greater.");
        }
        //substring
        String sense = "My name is fitendra.";
        String subname = sense.substring(11, 15);
        
        System.out.println(subname);
    }
}
