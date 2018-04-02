package com.example.demo;

import java.util.Scanner;

public class Runner {
    public static void main(String args[]) {
        MyOwnPerson a = new MyOwnPerson();
        Scanner scan = new Scanner(System.in);
        System.out.println("\t" + "What is your first name? ");
        a.setFirstName(scan.nextLine());
        System.out.println("\t" + "What is your last name? ");
        a.setLastName(scan.nextLine());
        System.out.println("\t" + "What is your phone number? ");
        a.setPhoneNumber(scan.nextLine());
        System.out.println("\t" + "What is your email address? ");
        a.setEmailAddress(scan.nextLine());

//        a.setFirstName("Shannon");
//        a.setLastName("Foster");
        System.out.print(a.WhatIsMyName());
        System.out.print("\n");
        System.out.print(a.ContactInformation());
//        Scanner sc = new Scanner(System.in);
//        sc.nextLine(lastName);

    }
}
