package bai1.sapxepnoibot;

import static bai1.sapxepnoibot.BubbleSort.bubbleSort;
import static bai1.sapxepnoibot.BubbleSort.list;

public class Bai1 {
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
}
