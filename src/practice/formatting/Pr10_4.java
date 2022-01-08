package practice.formatting;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pr10_4 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar myCal = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        myCal.set(2000, 01, 01);
        today.set(2016,01,29);
        long daysDiff = (today.getTimeInMillis() - myCal.getTimeInMillis())/1000/(60*60*24);

        Date myDate = new Date(myCal.getTimeInMillis());
        Date nowDate = new Date(today.getTimeInMillis());

        System.out.println("birth day :"+sdf.format(myDate));
        System.out.println("today :"+sdf.format(nowDate));
        System.out.println(daysDiff+"days");
    }
}
