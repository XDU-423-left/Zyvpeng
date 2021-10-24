package calendar;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Launcher {
    public static  void main(String[] args){
        int y=0,m=0,d=0;
        Scanner s= new Scanner(System.in);
        System.out.println("请输入年份");
        if(s.hasNextInt()){
            int year = s.nextInt();
            System.out.println("输入年份是"+year);
            y=year;
        }
        calculate a=new  calculate();
        if(y%4==0&y%100!=0|y%400==0){
        a.getmonth2();}
        else{
             a.getmonth();
        }
        System.out.println("请输入月份");
        if(s.hasNextInt()) {
            int month = s.nextInt();
            System.out.println("输入月份是" + month);
            m=month;
        }
        System.out.println("请输入具体是本月第几天");
        if(s.hasNextInt()) {
            int day = s.nextInt();
            System.out.println("输入日期是" + day);
            d=day;
        }
        GregorianCalendar mc =new GregorianCalendar();
        mc.set(y,m-1,d-1);
        Date date = mc.getTime();
        Week W= new Week();
        W.getweek(date);


        }
}
