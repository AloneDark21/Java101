package MergeSortAlgoritmasi;

public class Main {

    public static void main(String[] args) {
        int[] arr = {16,21,11,8,12,22};
        
        System.out.print("Merge Sort Oncesi Dizi : ");
        for (var i : arr) {
            System.out.print(" " + i);
        }
        MergeSort mergeSort = new MergeSort(arr);
    }
}
