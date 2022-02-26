import java.util.Random;

/**
 * QuickSort
 */
public class QuickSort {


    public static void quickSort(int[] arr, int leftIndex, int rightIndex)
    {
        if (leftIndex >= rightIndex)
            return ;

        int pivotIndex = new Random().nextInt(rightIndex-leftIndex) + leftIndex;
        int pivot = arr[pivotIndex];

        int leftPointer = leftIndex;
        int rightPointer = rightIndex;
        while(leftPointer < rightPointer)
        {
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer)
                leftPointer++;
            while(arr[rightPointer] >= pivot && leftPointer < rightPointer)
                rightPointer--;
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, rightIndex);
        
        quickSort(arr, leftIndex, leftPointer-1);
        quickSort(arr, leftIndex+1, rightIndex);
    }
    private static void swap(int[] arr, int first, int last)
    {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    void display(int[] arr)
    {
        for(int i = 0 ; i<arr.length; i++)
           System.out.println(arr[i]); 
    }
    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i =0; i<arr.length; i++)
        {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Displaying Array...");
        obj.display(arr);
        quickSort(arr, 0, arr.length-1);
        System.out.println("Displaying Sorted Array...");
        obj.display(arr);
    }
}