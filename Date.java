public class Date {
    private int day ,month ,year;
    private static int dayNow=0,monthNow=1 ,yearNow=1401;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getDayNow() {
        return dayNow;
    }

    public static void setDayNow(int dayNow) {
        Date.dayNow = dayNow;
    }

    public static int getMonthNow() {
        return monthNow;
    }

    public static void setMonthNow(int monthNow) {
        Date.monthNow = monthNow;
    }

    public static int getYearNow() {
        return yearNow;
    }

    public static void setYearNow(int yearNow) {
        Date.yearNow = yearNow;
    }
}
