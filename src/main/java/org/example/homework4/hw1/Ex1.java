package org.example.homework4.hw1;

import java.util.LinkedList;
import java.util.List;

/*
1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
Пример:
1 -> 2->3->4
Вывод:
4->3->2->1
 */

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numList = new LinkedList<>(List.of(1, 2, 3, 4));
        for (int i = numList.size() - 1; i >= 0; i--) {
            System.out.println(numList.get(i));
        }
    }
}
