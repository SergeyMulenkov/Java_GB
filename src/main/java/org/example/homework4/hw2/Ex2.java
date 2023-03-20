package org.example.homework4.hw2;

import java.util.Deque;
import java.util.LinkedList;

/*
Учитывая строку s, содержащую только символы '(', ')', '{', и , '}', определите  допустима ли входная строка.'['']'
Входная строка действительна, если:
Открытые скобки должны быть закрыты однотипными скобками.
Открытые скобки должны быть закрыты в правильном порядке.
Каждой закрывающей скобке соответствует открытая скобка того же типа.
 Пример 1:
Ввод: s = "()"
 Вывод: правда
Пример 2:
Ввод: s = "()[]{}"
 Вывод: правда
Пример 3:
Ввод: s = "(]"
 Вывод: ложь
 */
public class Ex2 {
    public static void main(String[] args) {
        String inputString1 = "()";
        String inputString2 = "()[]{}";
        String inputString3 = "(]";
        String inputString4 = "[(])";
        String inputString5 = "]";
        System.out.println(inputString1 + ": " + isValid(inputString1));
        System.out.println(inputString2 + ": " + isValid(inputString2));
        System.out.println(inputString3 + ": " + isValid(inputString3));
        System.out.println(inputString4 + ": " + isValid(inputString4));
        System.out.println(inputString5 + ": " + isValid(inputString5));
    }

    private static boolean isValid(String inputString) {
        char[] arr = inputString.toCharArray();
        Deque qu = new LinkedList();
        String open = "([{";
        for (Character ch : arr) {
            if (open.contains(ch.toString())) qu.add(ch);
            else if (qu.isEmpty()) return false;
            else if (ch.equals(']') && !qu.pollLast().equals('[')) return false;
            else if (ch.equals(')') && !qu.pollLast().equals('(')) return false;
            else if (ch.equals('}') && !qu.pollLast().equals('{')) return false;
        }
        return qu.isEmpty();
    }
}
