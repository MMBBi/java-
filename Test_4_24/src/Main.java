import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    public static void main(String[] args) {
        /*
        给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：
        如果存在，请返回 true ；否则，返回 false 。
         */
        int[] array1 = {2,3,5,7,4};
        int[] array2 = {2,3,5,6,4};

        boolean ret1 = threeOdd(array1);
        boolean ret2 = threeOdd(array2);
        System.out.println(ret1);
        System.out.println(ret2);
    }
    public static boolean threeOdd(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else if (array[i] % 2 == 0) {
                count = 0;
            }
        }
        return false;
    }

    public static void main9(String[] args) {
        /*
        给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
         */
        int[] array = {2 ,2 ,3 ,3 ,2, 3, 3};
        //方法1：
        //找到中间的那个值
        int ret = findMoreNum(array);
        System.out.println(ret);
        //方法2：
        //计数器
        int ret2 =  findMoreNum2(array);
        System.out.println(ret2);


    }
    public static int findMoreNum2(int[] array) {
        int count = 0;
        int ret = array[0];
        for (int i = 0; i < array.length; i++) {
            if (ret == array[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ret = array[i];
            }
        }
        return ret;
    }

    public static int findMoreNum(int[] array) {
        Arrays.sort(array);
        return  array[array.length/2];

    }

    public static void main8(String[] args) {
        /*
        两数之和
        给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
        力扣第一题
         */
        int[] array = {1,10,3,4,5};
        int n = 6;

        int[] ret = twoSum(array, n);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ret = {-1, -1};
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }

    public static void main7(String[] args) {
        /*
        调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
         */
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        int j = array.length-1;
        while (i < j) {
            while (i < j && array[i] % 2 != 0) {
                i++;
            }
            while (i < j && array[j] % 2 == 0) {
                j--;
            }
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main6(String[] args) {
        /*
        有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
         */
        int[] array = {1,2,1,2,3};
        int ret = 0;

        for (int i: array) {
            ret ^= i;
        }
        System.out.println(ret);
    }


    public static void main5(String[] args) {
        /*
        给定一个有序整型数组, 实现二分查找
         */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要查找的数字");
        int n = scanner.nextInt();
        
        int ret = binarySearch(array, n);
        if (ret >= 0) {
            System.out.println("找到了，下标为"+ret);
        } else {
            System.out.println("没有找到，数组里没有这个数字");
        }
    }
    
    public static int binarySearch(int[] array, int n) {
        int lift = 0;
        int right = array.length -1;
        while (lift <= right) {
            int mid = lift + right; //取中间数
            if (array[mid] == n) {
                return mid; //找到了返回对应的下标
            }else if (array[mid] > n) {
                right = mid - 1; //如果中间的这个值大于要找的，那么把右下标改为上一次的中间值-1
            } else {
                lift = mid + 1;//如果中间的这个值小于要找的，那么把右下标改为上一次的中间值+1
            }
        }
        return -1; //-1表示这个数组里面没有这个数
    }

    public static void main4(String[] args) {
        /*
        给定一个整型数组, 判定数组是否有序（递增）
         */
        int[] array1 = {1, 4, 3, 5, 6, 2};
        int[] array2 = {1, 2, 3, 4, 5, 6};

        if (!isOrderly(array1)) {
            System.out.println("无序");
        } else {
            System.out.println("有序");
        }

        if (!isOrderly(array2)) {
            System.out.println("无序");
        } else {
            System.out.println("有序");
        }
    }

    public static boolean isOrderly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main3(String[] args) {
    /*
    给定一个整型数组, 实现冒泡排序(升序排序)
     */
        int[] array = {1, 4, 3, 5, 6, 2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    public static void main2(String[] args) {
        /*
        实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
         */
        int[] array = {1, 2, 3, 4, 5, 6};

        int[] ret = copyOf(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret));
    }

    public static int[] copyOf(int[] array) {
        int[] ret = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ret[i] = array[i];
        }
        return ret;
    }

    public static void main1(String[] args) {
        /*
            实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
            返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
         */
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println(toString(array));
    }
    public static String toString(int[] array) {
        if (array == null) {
            return "null";
        }
        String sum = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                sum += array[i] + "]";
                return sum;
            }
            sum += array[i]+", ";
        }
        return sum;
    }
}
