package org.example.homework2.hw3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите размер массива: ");
        System.out.println("Новый массив: " + Arrays.toString(newArray(scan.nextInt())));
        scan.close();
    }

    private static int[] newArray(int size) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
            if ((array[i] >= 10 && array[i] <= 99) || (array[i] <= -10 && array[i] >= -99)) {
                sum += i;
            }
        }

        System.out.println("Введенный массив: " + Arrays.toString(array));
        convertedArray(array, sum);
        return array;
    }

    private static int[] convertedArray(int[] array, int sum) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] <= 0) {
                array[j] = sum;
            }
        }
        return array;
    }
}
