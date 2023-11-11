package BubbleSort;

import java.util.Scanner;

public class SortMain {
    public static void main(String[] args) {
        System.out.print("Dizinin boyutunu gir :");
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int array[] = new int[arraySize];
        System.out.println(arraySize + " boyutunda dizi olusturuldu \nBilgilerle doldur");

        for (int i = 0; i < arraySize; i++) {
            System.out.print(i + 1 + ". sayi : ");
            array[i] = input.nextInt();
        }

        ForSort(array);
        PrintArray(array);

        WhileSort(array);
        PrintArray(array);
    }

    static void ForSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void WhileSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
