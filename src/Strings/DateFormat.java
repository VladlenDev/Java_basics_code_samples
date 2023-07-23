package Strings;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args) {
        String pattern = "MM-dd-yyyy";

        System.out.println(dateByPattern(pattern));
    }

    public static String dateByPattern(String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        return date; // 06-23-2020
    }

}
