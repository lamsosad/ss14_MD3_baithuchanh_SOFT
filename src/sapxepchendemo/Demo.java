package sapxepchendemo;

import bai1.sapxepnoibot.BubbleSort;

import static sapxepchendemo.InsertionSort.insertion;
import static sapxepchendemo.InsertionSort.list;


public class Demo {

    public static void main(String[] args) {
        insertion(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
