package com.company;

//Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве
public class Task_03 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 23, 30, 45, 51, 64, 75, 88, 89, 90, 100, 110, 112, 200, 300, 500};
        boolean result = searchNumber(array, 31);
        System.out.println(result);
    }

    public static boolean searchNumber(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < num) {
                start = mid + 1;
            } else if (arr[mid] > num) {
                end = mid - 1;
            } else if (arr[mid] == num) {
                return true;
            }
        }
        return false;
    }
}
