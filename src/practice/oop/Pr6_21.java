package practice.oop;

public class Pr6_21 {
    public static int abs(int value){
        if(value<0) value *= -1;
        return value;
    }

    public static void main(String[] args) {
        int value =5;
        System.out.println("value = " + abs(value));
        value = -10;
        System.out.println("value = " + abs(value));
    }
}
