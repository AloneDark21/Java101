package SelectionShortAlgoritmasi;
//Denildiği üzere dizinin ilk 4 adımı yazıldı
public class SelectionSort 
{
    int temp;
    int[] arr;

    SelectionSort(int[] arr)
    {
        this.arr = arr;
        sort();
        print();
    }

    public void sort()
    {
        for(int i = 0; i < arr.length -1; i++)
    {
        int min = i;
        for(int j = i + 1; j < arr.length; j++)
        {
            if(arr[j] < arr[min])
            {
                min = j;
            }
        }
        temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
    }
    public void print()
    {
        System.out.print("Selection Sort İlk Dört Adim: ");
        {
            for(int i = 0; i < 4; i++)
            {
                System.out.print(" " + arr[i]);
            }
        }
    }
}

