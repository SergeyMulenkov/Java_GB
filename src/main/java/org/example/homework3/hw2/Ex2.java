package org.example.homework3.hw2;

import org.example.homework3.hw2.model.inputData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex2 {
    public static void main(String[] args) {
        inputData data = new inputData("Булочка с маком(мука высший сорт)", 32, 1, 12, "Россия");
        inputData data2 = new inputData("Булочка с маком(мука средний сорт)", 30, 2, 13, "Россия");
        inputData data3 = new inputData("Булочка с повидлом(мука средний сорт)", 25, 2, 13, "Кахахстан");
        inputData data4 = new inputData("Сосиска в тесте(мука высший сорт)", 32, 1, 15, "Армения");
        inputData data5 = new inputData("Пирог с капустой(мука высший сорт)", 40, 1, 35, "Азербайджан");
        inputData data6 = new inputData("Пирожок с картошкой(мука низкий сорт)", 35, 3, 10, "Туркменистан");

        List<inputData> listInputData = new ArrayList<>();
        listInputData.add(data);
        listInputData.add(data2);
        listInputData.add(data3);
        listInputData.add(data4);
        listInputData.add(data5);
        listInputData.add(data6);

        System.out.println("Введите категорию товаров: ");
        Scanner scanner = new Scanner(System.in);
        int priceMin = listInputData.get(0).getPrice();
        int grade = scanner.nextInt();
        scanner.close();
        for (inputData pd : listInputData){
            if (grade == pd.getGrade()){
                if (priceMin > pd.getPrice()) priceMin = pd.getPrice();
            }
        }
        System.out.println("Наименования товаров: ");
        for (inputData dp : listInputData){
            if (grade == dp.getGrade() && priceMin == dp.getPrice()) {
                System.out.println(dp.getName());
            }
        }
    }
}
