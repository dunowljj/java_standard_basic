package practice.oop2;

class Outer{
    class Inner{
        int iv = 100;
    }
}

public class Pr7_6 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        System.out.println("in.iv = " + in.iv);
    }
}
