public class Date {
    public int year;
    public int month;
    public int day;

    public void setDay(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printfDate() {
        System.out.println(this.year+"/"+this.month+"/"+this.day);
    }
}
