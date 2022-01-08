package practice.con_iter;

public class Pr4_9 {
    public static void main(String[] args) {
        //문자열 사용 금지 !
        int num =12345;
        int sum =0;
        while (num<10){
            sum += (num%10);
            num/=10;
            //자릿수 직접 쓰거나 구해서 정방향 순서?
        }

        System.out.println("sum = " + sum);
        /*
        int answer = Pr4_7(num+"");
        System.out.println("answer = " + answer);
    }
    
    
    public static int Pr4_7(String str){
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
         */


    }
}
