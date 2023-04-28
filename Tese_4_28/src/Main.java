import java.util.Arrays;


class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test);
    }

    public String toString() {
        System.out.print("aaa");
        return "bbb";
    }
}

public class Main {


    public static void main2(String[] args) {
        /*
        给定两个整型数组, 交换两个数组的内容.
         */
        int[] array = {1, 3, 5 , 7, 9,};
        int[] array2 = {2, 4, 6, 8, 10};

        swap(array,array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }

    public static void swap(int[] array, int[] array2) {
     int len1 = array.length;
     int len2 = array2.length;
     int len = Math.min(len1, len2);
        for (int i = 0; i < len; i++) {
            int tmp = array[i];
            array[i] = array2[i];
            array2[i] = tmp;
        }
    }

    public static void main1(String[] args) {

         /*
    给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
     */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        func(array);

        System.out.println(Arrays.toString(array));
    }


    public static void func(int[] array) {
        int lift = 0;
        int right = array.length-1;

        while (lift < right) {

            while (lift < right && array[lift] % 2 != 0) {
                lift++;
            }
            while (lift < right && array[right] % 2 == 0) {
                right--;
            }

            int tmp = array[lift];
            array[lift] = array[right];
            array[right] = tmp;
        }
    }
}
