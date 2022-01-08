package practice.lang;

public class Pr9_5 {
    public static String delChar(String src, String delCh){
        /*for (int i=0; i<delCh.length(); i++){
            src = src.replace(delCh.charAt(i), ' ');
        }
        return src;*/
        StringBuffer answer = new StringBuffer(src);
        for(int i=0; i<delCh.length(); i++){
            char danger = delCh.charAt(i);

            while (true){
                int idx = answer.indexOf(danger+"");
                if(idx == -1) break;
                answer.deleteCharAt(idx);
            }
        }
        return answer.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println("(1!2@3^4!5)"+" -> "+delChar("(1!2@3^4!5)", "~!@#$%^&*()"));
        System.out.println(delChar("(1 2 3 4\t5)", " \t"));
    }
}
