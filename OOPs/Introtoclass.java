
//define class
class Pen{
    String color; //properties of objects
    String type;

    public void write(){ //methods of object
        System.out.println("Writing something.");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //java bydefault maeks constructor if we don't write a constructor
    Student(){
        System.out.println("Constructor called");
    }
}

public class Introtoclass {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); //creating an object
        pen1.color = "Red";
        pen1.type = "Ball pen";
        pen1.write();
        

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen1.printColor();
        pen2.printColor();

        //student object
        Student s1 = new Student(); //new is used to allocate memory
        //student() is know as constructor
        //1.non parmetresized constructor . constructor does not retrun .construct can be called once.
        //the name of the constructor is same as the class name.
        //2.parmetresized constructor.
        //the name of the constructor is same as the function name.
        //if we take parameters inside normal constructor this becomes parameterized constructor.
        
        s1.name = "Jeeban";
        s1.age = 23;
        s1.printInfo();

        //student object
        Student s2 = new Student();

        //class member vailable
        s2.name = "Fitendra";
        s2.age = 21;

        s2.printInfo();
    }
    
}
