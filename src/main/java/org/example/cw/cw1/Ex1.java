package org.example.cw.cw1;

import java.util.Scanner;
//Задача 1: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("result : %d", subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int sum = 0, multi = 1;
        while (n != 0) {
            sum += n % 10;
            multi *= n % 10;
            n /= 10;
        }
        return multi - sum;
    }
}
