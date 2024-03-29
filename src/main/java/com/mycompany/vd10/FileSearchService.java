/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vd10;

import java.io.File;

/**
 *
 * @author ПК
 */
public class FileSearchService {
    public static void searchFiles(File directory, String extension) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(file.getPath());
                        searchFiles(file, extension);
                    } else if (file.getName().endsWith("." + extension)) {
                        System.out.println(file.getPath() + " " + file.length() + " байт");
                    }
                }
            }
        }
    }   
}
