package practice.OOP;

public class Pr6_18 {
    public static boolean isNumber(String str){
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch <'0' || ch >'9') return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "1237489";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까?" + isNumber(str));
    }
}
