public class Main {


    public static void main4(String[] args) {
        Date date1 = new Date();
        date1.printDay();
    }

    public static void main3(String[] args) {
        Date date1 = new Date(2023,4,26);
        date1.printDay();

    }

    public static void main2(String[] args) {
        Date date1 = new Date();
        date1.printDay();
        date1.setDay(2023,4,26);
        date1.printDay();
    }

    public static void main1(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();

        date1.setDay(2023, 4, 26);
        date2.setDay(2023, 4, 27);
        date3.setDay(2023, 4, 28);

        date1.printDay();
        date2.printDay();
        date3.printDay();

    }

}
