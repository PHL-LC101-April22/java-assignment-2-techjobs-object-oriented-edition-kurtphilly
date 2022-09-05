package practice;

public class DiagramPractice {

    public static void addOne(int x) {
        x++;
    }

    public static void addOneArr(int[] arr, int ix) {
        arr[ix] = arr[ix] + 1;
    }


    public static void main(String[] args) {
        int x;
        x = 5;
        addOne(x);
        int[] nums = new int[4];
        addOne(nums[0]);
        addOneArr(nums, 2);
        addOneArr(nums, 2);
        // STOP HERE
    }
}
