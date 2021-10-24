package calendar;

import java.util.Calendar;
import java.util.Date;

public class Week{


     void getweek(Date date){

        String[] weeks ={"星期一","星期二","星期三","星期四 ","星期五","星期六","星期天"};
        Calendar cal =Calendar.getInstance();
        cal.setTime(date);
        int week_index = cal.get(Calendar.DAY_OF_WEEK)-1;
        if(week_index<0){
            week_index = 0;
        }
        System.out.println(weeks[week_index]);

    }
}
