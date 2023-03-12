package org.example.seminar1.cw4;

//Задача 4: Дан массив целых чисел. Верно ли, что массив является симметричным?
public class Ex4 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,4,5,6,5,4,3};
        System.out.println(isArrSymmetrical(arr));
    }

    public static boolean isArrSymmetrical(int[] arr) {

        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i]!=arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
