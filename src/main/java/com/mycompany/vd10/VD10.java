/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vd10;

import static com.mycompany.vd10.FileSearchService.searchFiles;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ПК
 */
public class VD10 {

    public static void main(String[] args) {
        System.out.println("Дунина Виктория. РИБО-02-22. 4 вариант");
        System.out.println("Поиск файлов по расширению в указанном каталоге.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к каталогу: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Введите расширение файла для поиска (например, 'docx'): ");
        String extension = scanner.nextLine();

        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Ошибка: Неверный путь к каталогу. Пожалуйста, введите корректный путь к каталогу.");
            return;
        }

        if (!extension.matches("^\\w+$")) {
            System.out.println("Ошибка: Неверное расширение файла. Пожалуйста, введите корректное расширение файла.");
            return;
        }

        System.out.println("Идет поиск файлов с расширением '" + extension + "' в " + directoryPath);

        searchFiles(directory, extension);
    }
}
