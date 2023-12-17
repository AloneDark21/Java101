/*
[2], 7, 3, 5, 8, 9, 4, 15, 6
[2, 3], 7, 5, 8, 9, 4, 15, 6
[2, 3, 4], 7, 5, 8, 9, 15, 6
[2, 3, 4, 5], 7, 8, 9, 15, 6

ilk dört adımı yazdırdık
*/
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

