package practice.con_iter;

public class Pr4_10 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100+1);
        int input = 0;
        int count = 0;

        java.util.Scanner s = new java.util.Scanner(System.in);

        do{
            count++;
            System.out.println("1과 100사이의 값을 입력하세요 :");
            input = s.nextInt();

            if(input == answer) break;
            else if(input < answer) System.out.println("더 큰 수를 입력하세요");
            else if(input > answer) System.out.println("더 작은 수를 입력하세요");



        } while(true);
        System.out.println(count);
    }
}
