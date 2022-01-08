package practice.con_iter;

public class Pr4_3 {
    public static void main(String[] args) {
        int num =0;
        int sum =0;
        for (int i=1; i<=10; i++){
            num += i;
            sum += num;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
