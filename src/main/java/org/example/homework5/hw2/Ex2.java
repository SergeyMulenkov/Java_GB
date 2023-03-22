package org.example.homework5.hw2;

/*
2) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
вносить все слова не нужно.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = scanner.nextLine();
        System.out.print("Введите искомое слово: ");
        String slovo = scanner.nextLine().toLowerCase();
        scanner.close();
        Map<String, Integer> strCount = countWords(str, slovo);
        System.out.println(strCount);
    }

    private static Map<String, Integer> countWords(String input, String search) {
        search = search.toLowerCase();
        Map<String, Integer> strCount = new HashMap<>();
        var strArray = input.toLowerCase()
                .replace("—", "")
                .replace(".", "")
                .replace("  ", " ").split(" ");
        for (String str : strArray) {
            if (str.equals(search)) {
                int item = strCount.get(str) == null ? 0 : strCount.get(str);
                strCount.put(str, ++item);
            }
        }
        return strCount;
    }
}
