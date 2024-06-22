package CouplingInJava;
class Laptop{
    public void compile(){
        System.out.println(" Compiling......");
    }
}

class Programmer{
    public void code(Laptop lap){
        lap.compile();
        System.out.println("The code is Compiled");

    }
}
public class TightCoupling {
    public static void main(String[] args) {
        Programmer pog = new Programmer();
        Laptop l = new Laptop();
        pog.code(l); // Before Programmer Class Method call to create Object of Laptop Class
    }
}
