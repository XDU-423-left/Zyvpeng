package calendar;
import java.util.Scanner;
public class calculate {

    int []a={1,2,3,4,5,6,7,8,9,10,11,12};
     int p=1;
     Days d=new Days();

     void getmonth2(){
         for (int i: a) {
             System.out.println(i);
             d.getdays2(p);
             p++;
         }
     }

    void getmonth() {
        for (int i: a) {
            System.out.println(i);
            d.getdays(p);
            p++;
        }
    }

}
