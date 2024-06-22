package CouplingInJava;

interface Computer{
    void compile();
}

class Laptopp implements Computer{
    public void compile(){
        System.out.println("Compiling in Laptop");
    }
}

class Desktop implements Computer{
    public void compile(){
        System.out.println("The code is compile in Desktop");
    }
}

class Programer{
    public void code(Computer c){
        System.out.println("Coding...");
        c.compile();
    }
}
public class LoseCoupling {
    public static void main(String[] args) {
 /* This is Lose Coupling in Java it means there are not depend on the Object
 when create object Desktop then call Desktop when Laptop Class Obj create then call
 Laptop Method
  */
        Desktop d = new Desktop();
        Laptopp l  = new Laptopp();
        Programer p = new Programer();
        p.code(d);
        p.code(l);
    }
}
