import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "坤坤";
        person1.age = 25;

        System.out.println(person1.name+" "+person1.age);

        person1.sing();
        person1.dance();
        person1.rap();
        person1.playBasketball();
    }

    public static void main2(String[] args) {
        //二维数组的不规则初始化

        //数组的‘列’数据可以胜率，行不可以省略
        int[][] array = new int[2][];
        //数组的‘列’数据可以不相等，这叫做不规则初始化
        array[0] = new  int[2];
        array[1] = new  int[4];

        System.out.println(Arrays.deepToString(array));
    }

    public static void main1(String[] args) {
    /*
    二维数组的定义和遍历
     */
        //二维数组初始化方法1：
        int[][] array = {{1,2,3}, {4,5,6}};

        //遍历方法1：
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("==============================");

        //初始化方法2：
        int[][] array2 = new int[][] {{1,2,3}, {4,5,6}};

        //遍历方法2：
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("==============================");

        //初始化方法3：
        int[][] array3 = new int[2][3];

        //对上面array3数组进行赋值（有序）
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = i * array3[i].length + j;
            }
        }
        //打印方法3
        System.out.println(Arrays.deepToString(array3));

        System.out.println("==============================");
        //打印方法4
        for (int [] ret : array3) {
            for (int x : ret) {
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
