package org.example.homework2.hw1;

import java.util.Scanner;

/**
 * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int n = scan.nextInt();
        System.out.println("Cумма простых чисел = " + sumPrimeNumbers(n));
        scan.close();
    }

    public static int sumPrimeNumbers(int n){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            if (primeNumber(number)) {
                sum += number;
            }
        }
        return sum;
    }

    public static boolean primeNumber(int num) {
        Double sqrt = Math.sqrt(num);
        for (int i = 2; i <= sqrt.intValue(); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
