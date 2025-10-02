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

        phone.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        phone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        phone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        phone.setOwner(owner);
        phone.dial("999-999-9999");

        display(phone);

        CellPhone yourPhone = new CellPhone(1234
                ,"pixel","fi","888-88-888","ayah");


    }

    private static void display(CellPhone phone){
        System.out.println("---------");
        System.out.println("cell phone: [SN: " +  phone.getPhoneNumber() + "]");
        System.out.println(" owner: " + phone.getOwner());
        System.out.println(" model: " + phone.getModel());
        System.out.println(" number: " + phone.getPhoneNumber());
    }
}
