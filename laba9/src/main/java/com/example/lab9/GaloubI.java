package com.example.lab9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GaloubI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String date = scanner.nextLine();

        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((1[6-9]|[2-9]\\d)\\d{2}|(0[1-9]|1\\d|2[0-9])\\d{2}|3000)$";

        boolean isValid = Pattern.matches(regex, date);

        if (isValid) {
            System.out.println("date  is valid.");
        } else {
            System.out.println("date  is not valid.");
        }

    }

}
