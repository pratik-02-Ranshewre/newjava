import java.util.*;
public class datetime {
    public static void main(String[] args){
        int day , month , year ;
        int second , minute , hour;
        GregorianCalendar date = new GregorianCalendar();

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.DAY_OF_MONTH);
        year = date.get(Calendar.HOUR);

        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println("present date :"+day+"/"+(month-1)+"/"+year);
        System.out.println("present time:"+second+"."+minute+"."+hour);


    }
}