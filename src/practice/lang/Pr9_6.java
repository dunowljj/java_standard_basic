package practice.lang;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr9_6 {
    public static void main(String[] args) {
        String[] phoneNumArr ={
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"};

        ArrayList list = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println(">>");
            String input = scanner.nextLine().trim();

            if(input.equals("")){
                continue;
            } else if (input.equalsIgnoreCase("Q")){
                System.exit(0);
            }

            for(int i=0; i<phoneNumArr.length; i++){
//                String source = ".*"+input+".*";
                String source = "^[0-9]*"+input+"[0-9]*$";
                Pattern pattern = Pattern.compile(source);

                Matcher matcher = pattern.matcher(phoneNumArr[i].replace("-",""));
                boolean isMatched = matcher.find();
                //---------------------------------------
                if(isMatched) list.add(phoneNumArr[i]);
            }



            if(list.size() > 0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }
    }
}
