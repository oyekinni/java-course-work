import java.util.GregorianCalendar;

public class MyDate {
  private int year;
  private int month; // 0-based (0 = January)
  private int day;

  public MyDate() {
    GregorianCalendar cal = new GregorianCalendar();
    year = cal.get(GregorianCalendar.YEAR);
    month = cal.get(GregorianCalendar.MONTH);
    day = cal.get(GregorianCalendar.DAY_OF_MONTH);
  }

  public MyDate(long elapsedTime) {
    setDate(elapsedTime);
  }

  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  public void setDate(long elapsedTime) {
    GregorianCalendar cal = new GregorianCalendar();
    cal.setTimeInMillis(elapsedTime);
    year = cal.get(GregorianCalendar.YEAR);
    month = cal.get(GregorianCalendar.MONTH);
    day = cal.get(GregorianCalendar.DAY_OF_MONTH);
  }
}
