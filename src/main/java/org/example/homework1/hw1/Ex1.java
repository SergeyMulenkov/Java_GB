package org.example.homework1.hw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] part = str.trim().split("\\s+");
        print(part);
        array(part);
        System.out.println();
        print(part);
    }

    public static void print(String[] arr) {
        for (String i : arr) {
            System.out.printf((i) + " ");
        }
    }

    public static String[] array(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
