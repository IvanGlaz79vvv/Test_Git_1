package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("\nHello world!");

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String input = reader.readLine();
        System.out.println(input);

        input = reader.readLine();
        System.out.println(input);
        
        System.out.println("Заменил сообщение из гита");

        System.out.println("Новое сообщение добавил");

        System.out.println("А это добавил см после гита в IDEA");

        input = reader.;
        System.out.println(input);
    }
}
