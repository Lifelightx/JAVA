//polymerphism: same function is used to perform different operations

//types of polymerphism
//1.function overloading  (run time)
//2.function overriding (compile time)

import java.util.Scanner;

class Student{
    String name;
    int age;
    int roll;

    public void studenFun(){
        System.out.println("This is a student of our institution!");
    }
    public void studenFun(int roll){
        
        System.out.println("roll: "+roll);

    }
}

public class Polymerphisim {

    static void myFunction(String name){
        System.out.println("Good morning! "+name);
    }
    static void myFunction(){
        System.out.println("This function has no parameters!");
    }
    static void myFunction(int number){
        System.out.println("This function has one parameter! "+number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        myFunction(name);
        System.out.print("Enter number: "); 
        int number = sc.nextInt();
        myFunction(number);
        myFunction();

        Student s1 = new Student();
        s1.name = "Jeeban";
        s1.age = 23;
        

        s1.studenFun();
        s1.studenFun(12);
        s1.roll = 29;
        s1.studenFun(s1.roll);
        
    }
}
