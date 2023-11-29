public class task3 {
    public static void main(String [] args) {
        int [] nums = new int [] {5,2,3,7,6};
        mergeSort(nums, nums.length);
    }
    
    public static void mergeSort(int[] arr, int len) {
        if (len < 2) {
            return;
        }
        int middle = len / 2;
        int[] n = new int[middle];
        int[] r = new int[len - middle];
    
        for (int i = 0; i < middle; i++) {
            n[i] = arr[i];
        }
        for (int i = middle; i < len; i++) {
            r[i - middle] = arr[i];
        }
        mergeSort(n, middle);
        mergeSort(r, len - middle);
    
        merge(arr, n, r, middle, len - middle);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
            System.out.println();  
    }

    public static void merge(int[] arr, int[] n, int[] r, int nLen, int rLen) {
 
        int i = 0, j = 0, k = 0;
        while (i < nLen && j < rLen) {
            if (n[i] <= r[j]) {
                arr[k++] = n[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while (i < nLen) {
            arr[k++] = n[i++];
        }
        while (j < rLen) {
            arr[k++] = r[j++];
        }
    }
}