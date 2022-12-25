package org.example;

import java.io.FileWriter;
import java.util.Scanner;

public class Error {
    String firstName;
    String lastName;
    String thirdName;
    String birthDate;
    String gender;
    int telephoneNum;

    public Error(String firstName, String lastName, String thirdName, String birthDate, String gender, int telephoneNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.thirdName = thirdName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.telephoneNum = telephoneNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста введите:Вашу Фамилию, имя, отчество, дату рождения, пол и номкр телефона");
        try (FileWriter writer = new FileWriter("UserData")) {
            Error user = new Error(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextInt());
            writer.write(user.toString());
        } catch (Exception e) {
            System.out.println("Invalid input! - Ошибка ввода");
        }
    }

    @Override
    public String toString() {
        return "<" + lastName + "><" + firstName + "><" + thirdName + "><"
                + birthDate + "><" + gender + "><" + telephoneNum + '>';
    }
}