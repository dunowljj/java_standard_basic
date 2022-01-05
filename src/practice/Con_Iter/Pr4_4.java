package practice.Con_Iter;

public class Pr4_4 {
    public static void main(String[] args) {
        int sum =0;
        int answer;
       for (int i=1;;i++){
           if(i%2==0) sum -= i;
           else sum += i;

           System.out.println("i: "+i+",sum: "+sum);

           if(sum>=100) {
               answer = i;
               break;
           }
       }
        System.out.println(sum);
        System.out.println(answer);
    }
}
