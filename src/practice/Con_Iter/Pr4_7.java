package practice.Con_Iter;

public class Pr4_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println("sum = " + sum);


    }
}
