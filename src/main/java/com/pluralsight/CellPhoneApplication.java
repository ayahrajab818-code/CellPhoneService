package com.pluralsight;

import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.print  ("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        phone.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();

        phone.setPhoneNumber(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        phone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        phone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        phone.setOwner(owner);

    }
}
