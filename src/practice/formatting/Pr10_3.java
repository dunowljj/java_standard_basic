package practice.formatting;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pr10_3 {
    static int paycheckCount(Calendar from, Calendar to){
        if(from == null || to == null) return 0;
        int monDiff;
        int fMonth = from.get(Calendar.MONTH);
        int tMonth = to.get(Calendar.MONTH);
        int fYear = from.get(Calendar.YEAR);
        int tYear = to.get(Calendar.YEAR);
        int fDay = from.get(Calendar.DATE);
        int tDay = to.get(Calendar.DATE);

        monDiff = (tYear * 12 + tMonth) - (fYear * 12 + fMonth);
        if(monDiff<0) {
            return 0;
        } else if(monDiff == 0){
            if(tDay >= 21 && fDay <= 21) return 1;
        } else{
            if(fDay <= 21) monDiff++;
            if(tDay < 21) monDiff--;
        }
            return  monDiff;
    }

    static void printResult(Calendar from, Calendar to){
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(sdf.format(fromDate)+ " ~ "+ sdf.format(toDate)+":");

        System.out.println(paycheckCount(from, to));

    }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 0, 1);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 21);
        toCal.set(2020, 0, 21);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 2, 1);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 1);
        toCal.set(2020, 2, 23);
        printResult(fromCal, toCal);

        fromCal.set(2020, 0, 23);
        toCal.set(2020, 2, 21);
        printResult(fromCal, toCal);

        fromCal.set(2021, 0, 22);
        toCal.set(2020, 2, 21);
        printResult(fromCal, toCal);

    }
}
