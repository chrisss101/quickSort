package Running;
import Setup.QuickSort;

public class Runner {
    public static void main(String[] arr) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 3;
        array[2] = 7;
        array[3] = 5;
        array[4] = 4;
        array[5] = 9;
        array[6] = 2;
        array[7] = 3;
        array[8] = 6;
        array[9] = 1;
        QuickSort.QuickSort(array,1,9);
        for (int i = 0; i < array.length;i++) {
            System.out.println(array[i]);
        }
    }


}
