class Studentn{
    String name;
    int age;
    //method
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //constructor
    Studentn(){
        System.out.println("Constructor called"); 
    }
    //constructor with parameter
    // Studentn(String name, int age){
    //     System.out.println("Constructor called");
    //     this.name = name;
    //     this.age = age;
        
    // }
    //copy constructor
    Studentn(Studentn s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class Constructor {

    public static void main(String[] args) {
        //non-parameterized constructor
        Studentn s1 = new Studentn();
        s1.name = "Jeeban";
        s1.age = 23;
        // s1.printInfo();

        //parameterized constructor
        // Studentn s1 = new Studentn("Jeeban", 23);
        // s1.printInfo();

        //copy constructor
        Studentn s2 = new Studentn(s1);
        s2.printInfo();
        //if we want to use copy constructor we have to create a constructor.
        

        
    }
    
}
