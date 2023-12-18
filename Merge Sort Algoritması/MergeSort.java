package MergeSortAlgoritmasi;

import java.util.Arrays;

public class MergeSort {
    
    int[] arr;
    int left;
    int right;
    MergeSort(int[] arr)
    {
        this.arr = arr;
        sort(this.arr);
        print();

    }

    public void sort(int[] arr)
    {
        if(arr.length > 1)
        {
            int elemanSayısınınYarısı = arr.length/2;

            //dizinin sol yarısını sırala
            int[] leftArr = Arrays.copyOfRange(arr, 0, elemanSayısınınYarısı );
            sort(leftArr);

            //dizinin sol yarısını sırala
            int[] rightArr = Arrays.copyOfRange(arr,elemanSayısınınYarısı,arr.length );
            sort(rightArr);

            //dizileri birlerşir
            merge(arr, leftArr, rightArr);
        
        }

    }

    public void merge(int[] arr, int[] leftArr,int[] rightArr)
    {
        int i = 0, j = 0, k = 0;
        int leftLength = leftArr.length;
        int rightLength = rightArr.length;

        while(i < leftLength && j <rightLength)
        {
            if(leftArr[i] <= rightArr[j])
            {
                arr[k] = leftArr[i];
                i++;
            }

            else
            {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < leftLength)
        {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rightLength)
        {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    public void print()
    {
        System.out.print("\nMerge Sort Sonrası Dizi : ");
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}
