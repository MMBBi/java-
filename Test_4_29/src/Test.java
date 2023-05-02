    import java.util.Date;

    public class Test {
        public static void main(String[] args) {
            Date date = new Date();//这里使用的Date类是java中提供的Date类。
            //获得一个毫秒级的时间戳。
            System.out.println(date.getTime());
        }
    }
