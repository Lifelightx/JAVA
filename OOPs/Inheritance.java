class Shape{
    String color;

    public void area(){
        System.out.println("display area");
    }

    public void printInfo(){
        System.out.println("color of shape: "+this.color);
    }
}
// there are four types of inheritance
//single level inheritance
class Tringle extends Shape{
    public void area(int length, int bredth){
        System.out.println("Area of Tringle: "+length*bredth*1/2);
    }

}
//multi level inheritance (from tringle)
class EquilateralTringle extends Tringle{
    public void area(int l,int h){
        System.out.println("Area of the tringle: "+l*h*1/2);
    }
}

//hierarchial inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println("Area of circle: "+3.14*r*r);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // System.out.println(r1.color);

        Tringle t1 = new Tringle();
        t1.color = "red";
        t1.area();
        t1.area(4,5);
        t1.printInfo();

    }
}
