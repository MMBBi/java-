import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Main {


    public static void main7(String[] args) {
        /*
        实现一个方法 avg, 以数组为参数,
        求数组中所有元素的平均值(注意方法的返回值类型).
         */
        int[] array = {1,2,3,4,5};

        double ret = avg(array);
        System.out.println(ret);
    }
    public static double avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }



    public static void main6(String[] args) {
        /*
        实现一个方法 sum, 以数组为参数, 求数组所有元素之和
         */
        int[] array = {1,2,3,4,5};

        int ret = sum(array);
        System.out.println(ret);
    }
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static void main5(String[] args) {
        /*
        实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
        并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
         */
        int[] array = {1,2,3,4,5};
        int[] ret = transForm(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret));

    }
    public static int [] transForm (int[] array) {
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i] * 2;
        }
        return ret;
    }

    public static void main4(String[] args) {
        /*
        实现一个方法 printArray, 以数组为参数,
        循环访问数组中的每个元素, 打印每个元素的值.
         */
        int[] array = {1,2,3,4,5};

        printfArray(array);
    }

    public static void printfArray(int[] array) {
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void main3(String[] args) {
        /*
         * 创建数组，并且赋初始值
         */
        //方法1：
        int[] array = {1,2,3,4,5};
        //方法2：
        int[] array1 = new int[] {1,2,3,4,5};
        //方法3
        int[] array2 = new int[5];
        //赋值
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    public static void main2(String[] args) {
        int[] array1 = {1, 2, 3, 4};

        int[] ret = copyOf(array1,array1.length*2);

        int[] ret2 = new int[array1.length];
        System.arraycopy(array1, 0 ,ret2,0,array1.length);



        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(ret2));

    }

    public static void main1(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }
}

