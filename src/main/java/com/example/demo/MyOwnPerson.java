package com.example.demo;

public class MyOwnPerson {

    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String EmailAddress;

    public String WhatIsMyName() {
        return "It's great to meet you " + getFirstName() + " " + getLastName() + "! Can I call you " + getFirstName() + "?";
    }

    public String  ContactInformation() {
        return "Your phone number is " + getPhoneNumber() + ", and your e-mail address is " + getEmailAddress() + ".";
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }
}
