package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        String firstName = "Ivan";
        String middleName = "ivanovich";
        String lastName = "Ivanov";
        String space = " ";
        String fullName = lastName + space + firstName + space + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задание 2
        String fullNameCapitalLetters = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameCapitalLetters);

        // Задание 3
        String fullNameSemicolon = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullNameSemicolon);

        // Задание 4

        String fullName2 = "Иванов Семён Семёнович";
        String fullName2Without = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName2Without);
    }
}
