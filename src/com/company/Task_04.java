package com.company;

//Подсчитать количество треугольников, у которых стороны заданы целыми числами, и площадь которых не больше 100
public class Task_04 {
    public static void main(String[] args) {
        final int MAX_SIDE = 200;
        final int MAX_SQUARE = 100;
        int count = 0;
        for (int a = 1; a <= MAX_SIDE; a++) {
            for (int b = a; b <= MAX_SIDE; b++) {
                for (int c = b; c <= MAX_SIDE; c++) {
                    if (a + b > c) {
                        double p = (a + b + c) / 2.0;
                        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                        if (square <= MAX_SQUARE) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count); // 2396
    }
}
