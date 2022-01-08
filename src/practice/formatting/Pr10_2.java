package practice.formatting;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pr10_2 {
    public static void printGuide(){
        System.out.println("yyyy/MM/dd의 형태로 입력해주세요(입력예:2017/05/11)");
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        String input = "";
        String[] dayOfWeek = {"일","월","화","수","목","금","토"};
        printGuide();

        while (true) {
            try {

                    if((input = br.readLine()) != null) {
                        date = sdf.parse(input);
                        break;
                    }
            }catch(Exception e){
                printGuide();
            }
        }
        SimpleDateFormat sdf2 = new SimpleDateFormat("E");
        System.out.println(sdf2.format(date));
    }
}

