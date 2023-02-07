public class Sorter {
    public static void sel_sort(int numArray[]) 
    { 
        int n = numArray.length; 
   
        // traverse unsorted array 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (numArray[j] < numArray[min_idx]) 
                    min_idx = j; 
   
            // swap minimum element with compared element  
            int temp = numArray[min_idx]; 
            numArray[min_idx] = numArray[i]; 
            numArray[i] = temp; 
        } 
    } 

    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }
}
