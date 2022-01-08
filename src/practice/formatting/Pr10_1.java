package practice.formatting;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pr10_1 {
    /*private static void printEventDate(int index, Calendar calendar){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일 입니다.");
        Date date = getEventDate(index, calendar);
        System.out.println(sdf.format(date));
    }
    private static Date getEventDate(int index, Calendar calendar){
        Calendar eventCalendar = getEventCalendar(index, calendar);
        Date date = new Date(eventCalendar.getTimeInMillis());
        return date;
    }
    private static Calendar getEventCalendar(int index, Calendar calendar){
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, index);
        calendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
        calendar.set(Calendar.DAY_OF_WEEK, 1);
        return  calendar;
    }
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        for (int i=0; i<12; i++){
            printEventDate(i, calendar);
        }

    }*/
}
