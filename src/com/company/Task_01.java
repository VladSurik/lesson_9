package com.company;
/*
Заполнить массив случайными числами. Подсчитать:
- количество элементов которые больше своего соседа слева
- количество четных элементов
- количество элементов которые меньше среднего арифметического
 */

import java.util.Random;

public class Task_01 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        int[] arrayRandom = new int[100];
        int sumArray = 0;
        for (int a = 0; a < arrayRandom.length; a++) {
            arrayRandom[a] = random.nextInt(100) + 1;
            sumArray += arrayRandom[a];
        }
        double average = sumArray / arrayRandom.length;
        int cntMoreThanLeft = 0;
        int cntEvenNumbers = 0;
        int cntLessThanAverage = 0;

        for (int i = 0; i < arrayRandom.length; i++) {
            if (i > 0) {
                if (arrayRandom[i] > arrayRandom[i - 1]) {
                    cntMoreThanLeft++;
                }
            }
            if (arrayRandom[i] % 2 == 0) cntEvenNumbers++;
            if (arrayRandom[i] < average) cntLessThanAverage++;
        }
        System.out.println("количество элементов которые больше своего соседа слева: " + cntMoreThanLeft);
        System.out.println("количество четных элементов: " + cntEvenNumbers);
        System.out.println("количество элементов которые меньше среднего арифметического " + cntLessThanAverage);
    }
}