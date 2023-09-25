public class Sorter{
    public static void main(String[] args) {}
    
    void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void selectionSort(int[] arr)
    {  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int k = i;  
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[k])
                    k = j;
            int min = arr[k];   
            arr[k] = arr[i];  
            arr[i] = min;  
        }  
    }
}