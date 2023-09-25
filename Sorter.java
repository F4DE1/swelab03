public class Sorter{
    public static void main(String[] args)
    {
        
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