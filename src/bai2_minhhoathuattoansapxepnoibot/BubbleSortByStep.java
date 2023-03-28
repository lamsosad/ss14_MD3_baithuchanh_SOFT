package bai2_minhhoathuattoansapxepnoibot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập độ dài mảng: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " phần tử cho mảng: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);

    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Đổi " + list[i] + " vơi " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Mảng có thể được sắp xếp và không cần vượt qua tiếp theo");
                break;
            }
            /* Show the list after sort */
            System.out.print("Lần thứ  " + k + "' sắp xếp: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "  ");
            }
            System.out.println();
        }
    }
}
