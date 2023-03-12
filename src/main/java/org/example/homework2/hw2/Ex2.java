package org.example.homework2.hw2;

import java.util.Scanner;

/**
 * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int n = scan.nextInt();
        System.out.println("Последовательность: " + increasingSequence(n));
        scan.close();
    }

    private static boolean increasingSequence(int n) {
        Scanner scan = new Scanner(System.in);
        int firsttNumber = scan.nextInt();
        for (int i = 1; i < n; i++) {
            int lastNumber = scan.nextInt();
            if (lastNumber < firsttNumber){
                return false;
            }
            firsttNumber = lastNumber;
        }
        return true;
    }
}
