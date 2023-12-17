package InsertionSort;

public class InsertionSort {
    
    int[] arr;
    InsertionSort(int[] arr)
    {
        this.arr = arr;
        sort();
        print();
    }

    public void sort()
    {
    for(int i = 0; i < arr.length; i++)
    {
        int temp = arr[i];
        int j = i-1;

        while(j >= 0 && temp < arr[j])
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
    }
    }
    public void print()
    {
        System.out.print("Insertion Sort Sonrası Dizi : ");
        for (var i : arr) {
            System.out.print(" "+ i);
        }
    }
}

