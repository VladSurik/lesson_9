package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Попросить пользователя ввести строку и имя файла. Записать строку в файл.
public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();
        System.out.print("Введите текст: ");
        String textUser = scanner.nextLine();
        writeToFileV2(textUser, fileName);

    }
    private static void writeToFileV2(String str, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
