/*
[22], 27, 16, 2, 18, 6
[22, 27], 16, 2, 18, 6
[22, 27, 16], 2, 18, 6
[16, 22, 27, 2], 18, 6
[2, 16, 22, 27, 18], 6
[2, 16, 18, 22, 27, 6]
[2, 6, 16, 18, 22, 27]

adımlar şu şekildedir
*/
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

