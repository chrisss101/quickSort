package Setup;

public class QuickSort {
    public void QuickSort(int[] arr, int left, int right) {
        if (left < right) {
                int pivot = partition(arr,left,right);
                QuickSort(arr,left,pivot-1);
                QuickSort(arr,pivot+1,right);

        }
    }

    public int partition(int[] arr, int left,int right) {
        int pivot  = arr[right];
        int j = arr[left-1];
        int i = 0;

        for ( i = left; i < right; i++) {
            if (arr[j] < pivot) {
                i++;
                int place = j;
                j = i;
                i = pivot;

            }
        }
        int place2 = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = place2;
        return i+1;
    }
}
