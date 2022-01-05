package practice.Operator;

public class Pr3_6 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = ((int)(((5/9f * ((float)fahrenheit -32)) + 0.005f)*100))/100.0f;
        //C = 5/9 * (F - 32)

        //기본이 int, double 임을 기억하자

        System.out.println("Fahrenheit"+ fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
