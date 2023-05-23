package com.example.lab9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String date = scanner.nextLine();

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        boolean isValid = Pattern.matches(regex, date);

        if (isValid) {
            System.out.println("Date is valid.");
        } else {
            System.out.println("Date is not valid.");
        }

    }

}
