package org.example.seminar2;

import org.example.seminar2.model.Vector;

public class Ex4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 2.0, 1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("Длина вектора = " + vector1.lengthVector());
        System.out.println("Скалярное произведение = " + vector1.scalarMulti(vector2));
        System.out.println("Векторное произведение = "+vector1.vectorMulti(vector2));
        System.out.println("Косинус угла = "+vector1.vectorCos(vector2));
        System.out.println("Сумма векторов = "+vector1.vectorSum(vector2));
        System.out.println("Разность векторов = "+vector1.vectorDiff(vector2));
    }
}
