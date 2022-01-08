package practice.oop2;

class Outer2{
    static  class Inner {
        int iv =200;
    }
}

class Pr7_7 {
    public static void main(String[] args) {
        Outer2.Inner in = new Outer2.Inner();
        System.out.println("in.iv = " + in.iv);
    }
}
