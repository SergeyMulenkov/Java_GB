package org.example.homework1.hw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Ввод: ");
        int a = sc.nextInt();
        if (a != 0) {
            boolean flag = true;
            while (flag) {
                int b = sc.nextInt();
                if (b != 0) {
                    if (a > 0 && b < 0) {
                        sum += a;
                    }
                    a = b;
                } else {
                    System.out.println("Вывод: " + sum);
                    flag = false;
                }
            }
        } else {
            System.out.println(0);
        }
    }
}
