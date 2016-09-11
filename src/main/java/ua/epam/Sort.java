package ua.epam;

/**
 * Created by Olia on 11.09.2016.
 */
public class Sort {

    //bubble
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {              // скільки елементів в масиві, стільки раз будем робити зовнішній прохід по масиву
            for (int j = arr.length - 1; j > i; j--) {          // порівнюємо вибране число з кожним елементом масиву
                if (arr[j - 1] > arr[j]) {                      // якщо вибране число > за наступне - міняємо місцями, іначе - йдем по масиву
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    //selection
    public static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){
            int min = i;
            for ( int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min]) min = j;
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

    //insertion
    public static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > tmp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    //quick
    public static int[] quickSort(int[] arr, int left, int right){
        int p, l, r;
        l = left;
        r = right;
        p = arr[left];
        while (left < right){
            while ( (arr[right] >= p) && (left < right))
                right--;
            if (left != right){
                arr[left] = arr[right];
                left++;
            }
            while ((arr[left] <= p && (left < right)))
                left++;
            if (left != right){
                arr[right] = arr[left];
                right--;
            }
        }
        arr[left] = p;
        p = left;
        left = l;
        right = r;
        if (left < p){
            quickSort(arr,left, p - 1);
        }
        if (right > p){
            quickSort(arr, p + 1, right);
        }
        return arr;
    }

    //shella
    public static int[] shellaSort(int[] arr){
        int step = arr.length / 2;
        while (step > 0){
            for (int i = 0; i < (arr.length - step); i++){
                int j = i;
                while ((j >= 0) && (arr[j] > arr[j + step])){
                    int tmp = arr[j];
                    arr[j] = arr[j + step];
                    arr[j + step] = tmp;
                    j = j - step;
                }
            }
            step = step / 2;
        }
        return arr;
    }

    //gnome (insertion + bubble)
    public static int[] gnomeSort(int[] arr){
        int i = 1, j = 2;
        while (i < arr.length){
            if (arr[i - 1] < arr[i]){
                i = j;
                j++;
            } else {
                int tmp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = tmp;
                i--;
                if (i == 0){
                    i = j;
                    j++;
                }
            }
        }
        return arr;
    }
}
