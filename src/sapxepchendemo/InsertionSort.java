package sapxepchendemo;

public class InsertionSort {
     static int[] list = {2, 4, 5, 7, 3, 6, 8, 3, 8, 36, 267, 213, 46, 23};
    public static void insertion(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > temp) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
    }
}
