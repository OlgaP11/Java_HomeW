public class task3 {
    public static void main(String [] args) {
        int [] nums = new int [] {5,2,3,7,6};
        mergeSort(nums, nums.length);
    }
    
    public static void mergeSort(int[] arr, int len) {
        if (len < 2) { // После того, как первый подмассив разделит на массивы в один элемент, перейдет со строки 21 на 24
            return;
        }
        int middle = len / 2;
        int[] n = new int[middle];
        int[] r = new int[len - middle];
    
        for (int i = 0; i < middle; i++) {
            n[i] = arr[i];
        }
        for (int i = middle; i < len; i++) { // Берем с середины, чтобы пройтись по первонач массиву
            r[i - middle] = arr[i]; // Для r вычетаем из i середину, чтобы по его индексам пройтись
        }
        mergeSort(n, middle); 
        mergeSort(r, len - middle);
    
        merge(arr, n, r, middle, len - middle); // Вначале соберет первый массив и распечатает, затем перейдет на стр 22
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
            System.out.println();  
    }

    public static void merge(int[] arr, int[] n, int[] r, int nLen, int rLen) {
 
        int i = 0, j = 0, k = 0;
        while (i < nLen && j < rLen) {// Проверка, какое больше значение. Ограничение длина одного из текущих массивов
            if (n[i] <= r[j]) {
                arr[k++] = n[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        } 
        while (i < nLen) { // Добавление хвостов
            arr[k++] = n[i++];
        }
        while (j < rLen) {
            arr[k++] = r[j++];
        }
    }
}