package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        String firstName = "Ivan";
        String middleName = "ivanovich";
        String lastName = "Ivanov";
        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
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

        // Задание 5
        String fullName3 = "Ivanov Ivan Ivanovich";
        String lastName3 = fullName3.substring(0, fullName3.indexOf(' '));
        String firstName3 = fullName3.substring(fullName3.indexOf(' ') + 1, fullName3.lastIndexOf(' '));
        String middleName3 = fullName3.substring(fullName3.lastIndexOf(' ') + 1, fullName3.length() - 1);
        System.out.println("Имя сотрудника - " + firstName3);
        System.out.println("Фамилия сотрудника - " + lastName3);
        System.out.println("Отчество сотрудника - " + middleName3);

        // Задание 6
        String fullName4 = "ivanov ivan ivanovich";
        char[] arrayFullName4 = fullName4.toCharArray();
        System.out.print(Character.toUpperCase(arrayFullName4[0]));
        for (int i = 0; i < fullName4.toCharArray().length - 1; i++) {
            if (arrayFullName4[i] == ' ') {
                System.out.print(Character.toUpperCase(arrayFullName4[i + 1]));
            } else {
                System.out.print(arrayFullName4[i + 1]);
            }
        }
        System.out.println();

        // Задание 7
        String number1 = "135";
        String number2 = "246";
        StringBuilder number = new StringBuilder(number1 + number2);
        for (int i = 0; i < number.length(); i++) {
            for (int i1 = i + 1; i1 < number.length(); i1++) {
                char a = number.charAt(i);
                char b = number.charAt(i1);
                if (a > b) {
                    number.setCharAt(i, b);
                    number.setCharAt(i1, a);
                }
            }
        }
        System.out.println("Данные строки - " + number);

        // Задание 7 (более простой вариант)
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < number1.length(); i++) {
            num.append(number1.charAt(i));
            num.append(number2.charAt(i));
        }
        System.out.println("Данные строки - " + num);

        // Задание 8
        String alphabet = "aabccddefgghiijjkk";
        StringBuilder repeatedLetters = new StringBuilder(alphabet);
        for (int i = 0; i < repeatedLetters.length() - 1; i++) {
            char a = repeatedLetters.charAt(i);
            char b = repeatedLetters.charAt(i + 1);
            if (a == b) {
                repeatedLetters.delete(i, i + 1);
            }
        }
        System.out.println(repeatedLetters);
    }
}
