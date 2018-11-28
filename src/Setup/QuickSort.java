package Setup;

public class QuickSort {
    public static void QuickSort(int[] arr, int left, int right) {
        if (left < right) {
                int pivot = partition(arr,left,right);

                QuickSort(arr,left,pivot-1);
                QuickSort(arr,pivot+1,right);

        }
    }

    public static int partition(int[] arr, int left,int right) {
        int pivot  = arr[right];
        int j = left-1;


        for ( int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                j++;
                int place = arr[j];
                arr[j] = arr[i];
                arr[i] = place;

            }
        }
        int place2 = arr[j+1];
        arr[j+1] = arr[right];
        arr[right] = place2;
        return j+1;
    }
}
