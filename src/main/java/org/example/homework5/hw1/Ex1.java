package org.example.homework5.hw1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1) Подсчитать количество вхождения каждого слова
Пример:
Россия идет вперед всей планеты. Планета — это не Россия.
toLoverCase().
(Усложнение - игнорировать пунктуацию)*
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = scanner.nextLine();
        scanner.close();
        Map<String, Integer> strCount = countWords(str);
        System.out.println(strCount);
    }

    private static Map<String, Integer> countWords(String input) {
        Map<String, Integer> strCount = new HashMap<>();
        var strArray = input.toLowerCase()
                .replace("—", "")
                .replace(".", "")
                .replace("  ", " ").split(" ");
        for (String str : strArray) {
            int item = strCount.get(str) == null ? 0 : strCount.get(str);
            strCount.put(str, ++item);
        }
        return strCount;
    }
}