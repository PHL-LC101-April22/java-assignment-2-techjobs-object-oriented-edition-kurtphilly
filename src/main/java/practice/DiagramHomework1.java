package practice;

public class DiagramHomework1 {

    public static void sum(int a, int b) {
        int f = a + b;
        // Each time you get here, stop and take a screenshot
        // of the diagram before exiting (returning)
    }

    private static void swapArr(int[] arr, int ix0, int ix1) {
        int temp = arr[ix0];
        arr[ix0] = arr[ix1];
        arr[ix1] = temp;
        // Each time you get here, stop and take a screenshot
        // of the diagram before exiting (returning)
    }

    private static void mystery(int[] arr, int[] arr2, int ix) {
        int ix2 = ix + 1;
        arr[ix] = arr2[ix2];
    }


    public static void main(String[] args) {
        // TODO: make a copy of https://docs.google.com/drawings/d/1Ih2Ltb66Iqz79TcZHrRmroKHPNENbi7tVjgtyXjpmK0/edit
        // TODO: Make a diagram of the following
        int x = 14;
        int y = 7;
        sum(x, y); // sum(14, 7);
        sum(y, y); // sum(7, 7);
        sum(x, x); //sum(14, 14)
        int[] z = new int[5];
        z[0] = x;
        z[3] = y;
        swapArr(z, 0, 3);
        swapArr(z, 1, 0);
        z[2] = 5;
        swapArr(z, 3, 2);
        swapArr(z, 1, 4);

        int[] q = new int[5]; // Start here
        mystery(q, z, 0);
        mystery(z, q, 1);
        mystery(q, z, 2);
        mystery(q, q, 0);




    }
}
