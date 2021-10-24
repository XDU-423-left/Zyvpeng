package calendar;

public class Days {
    void getdays(int month) {
        if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
            System.out.println("1  2  3  4  5  6  7  8  9  10");
            System.out.println("11 12 13 14 15 16 17 18 19 20");
            System.out.println("21 22 23 24 25 26 27 28 29 30");
            System.out.println("31");
        } else if (month == 4 | month == 6 | month == 9 | month == 11) {
            System.out.println("1  2  3  4  5  6  7  8  9  10");
            System.out.println("11 12 13 14 15 16 17 18 19 20");
            System.out.println("21 22 23 24 25 26 27 28 29 30");
        } else {
            System.out.println("1  2  3  4  5  6  7  8  9  10");
            System.out.println("11 12 13 14 15 16 17 18 19 20");
            System.out.println("21 22 23 24 25 26 27 28");
        }

    }


    void getdays2(int month) {
        if (month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) {
            System.out.println("1  2  3  4  5  6  7  8  9  10");
            System.out.println("11 12 13 14 15 16 17 18 19 20");
            System.out.println("21 22 23 24 25 26 27 28 29 30");
            System.out.println("31");
        } else if (month == 4 | month == 6 | month == 9 | month == 11) {
            System.out.println("1  2  3  4  5  6  7  8  9  10");
            System.out.println("11 12 13 14 15 16 17 18 19 20");
            System.out.println("21 22 23 24 25 26 27 28 29 30");
        } else {
            System.out.println("1  2  3  4  5  6  7  8  9  10");
            System.out.println("11 12 13 14 15 16 17 18 19 20");
            System.out.println("21 22 23 24 25 26 27 28 29");
        }
    }
}
