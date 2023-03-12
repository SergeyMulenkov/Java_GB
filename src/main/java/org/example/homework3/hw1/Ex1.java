package org.example.homework3.hw1;

import org.example.homework3.hw1.model.inputData;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Ex1 {
    public static void main(String[] args) {
        inputData data = new inputData("Булочка с маком(мука высший сорт)", 32, 1);
        inputData data2 = new inputData("Булочка с маком(мука средний сорт)", 30, 2);
        inputData data3 = new inputData("Булочка с повидлом(мука средний сорт)", 25, 2);
        inputData data4 = new inputData("Сосиска в тесте(мука высший сорт)", 29, 1);
        inputData data5 = new inputData("Пирог с капустой(мука высший сорт)", 40, 1);
        inputData data6 = new inputData("Пирожок с картошкой(мука низкий сорт)", 35, 3);

        List<inputData> dataList = new ArrayList<>();
        dataList.add(data);
        dataList.add(data2);
        dataList.add(data3);
        dataList.add(data4);
        dataList.add(data5);
        dataList.add(data6);

        int priceMax = 0;
        for (inputData dt : dataList) {
            if (dt.getName().contains("высший")) {
                if (dt.getPrice() > priceMax && dt.getGrade() == 1 || dt.getGrade() == 2) priceMax = dt.getPrice();
            }
        }
        System.out.println("Наивысшая цена = " + priceMax);
    }
}

