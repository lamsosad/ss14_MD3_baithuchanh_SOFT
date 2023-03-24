package bai3_sapxepchon;

import static bai3_sapxepchon.SelectionSort.list;
import static bai3_sapxepchon.SelectionSort.selectionSort;

public class Bai3 {
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
}
