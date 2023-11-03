package practice_13;

import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Запись в файл
            System.out.println("Введите текст для записи в файл:");
            String textToWrite = scanner.nextLine();
            writeToTextFile("test.txt", textToWrite);

            // 2. Вывод информации из файла на экран
            System.out.println("Содержимое файла test.txt:");
            String fileContent = readFromTextFile("test.txt");
            System.out.println(fileContent);

            // 3. Замена информации в файле
            System.out.println("Введите текст для замены в файле:");
            String newText = scanner.nextLine();
            replaceTextInFile("test.txt", textToWrite, newText);

            // 4. Добавление текста в конец файла
            System.out.println("Введите текст для добавления в конец файла:");
            String textToAdd = scanner.nextLine();
            appendTextToFile("test.txt", textToAdd);

            // Закрываем сканнер
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для записи текста в файл
    private static void writeToTextFile(String fileName, String text) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
        }
    }

    // Метод для чтения текста из файла
    private static String readFromTextFile(String fileName) throws IOException {
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
        }
        return fileContent.toString();
    }

    // Метод для замены информации в файле
    private static void replaceTextInFile(String fileName, String oldText, String newText) throws IOException {
        String fileContent = readFromTextFile(fileName);
        fileContent = fileContent.replace(oldText, newText);
        writeToTextFile(fileName, fileContent);
    }

    // Метод для добавления текста в конец файла
    private static void appendTextToFile(String fileName, String text) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(text);
        }
    }
}