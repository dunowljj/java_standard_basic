package practice.lang;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr9_6_Re {


    private static boolean isInputMatchedWithNum(String input, String[] phoneNumArr, int index){
        Pattern pattern = makePattern(input);
        return isPatternMatchedWithNum(pattern, phoneNumArr, index);
    }
    private static Pattern makePattern(String input){
        String source = "^[0-9]*"+input+"[0-9]*$";
        Pattern pattern = Pattern.compile(source);
        
        return pattern;
    }
    private static boolean isPatternMatchedWithNum(Pattern pattern, String[] phoneNumArr, int index){
        Matcher matcher = pattern.matcher(phoneNumArr[index].replace("-",""));
        return matcher.find();
    }
    private static boolean isInputEmpty(String input) {return input.equals("");}
    private static boolean isInputQuit(String input) {return input.equalsIgnoreCase("Q");}


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

            if(isInputQuit(input)){
                continue;
            } else if (isInputEmpty(input)){
                System.exit(0);
            }

            for(int i=0; i<phoneNumArr.length; i++){
                if(isInputMatchedWithNum(input, phoneNumArr, i))
                    list.add(phoneNumArr[i]);
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
