package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Задание 1
        Scanner Name = new Scanner(System.in);
        System.out.println("Имя");
        String firstName = Name.nextLine();
        System.out.println("Отчество");
        String middleName = Name.nextLine();
        System.out.println("Фамилия");
        String lastName = Name.nextLine();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        // Задание 2
        System.out.println(fullName.toUpperCase());

        // Задание 3
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);

    }
}

