package com.example.Cinemaxify;

public class Spouse implements User{

    private String name;
    private String memberName = "spouse";
    private int age;
    private Long contact;
    private String address;

    @Override
    public void setUserDetails(String name, int age, Long contact, String address) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.address = address;
    }

    @Override
    public void getUserDetails() {
        System.out.println("Hello " + name + " you have entered the following details for " + memberName);
        System.out.println("age: " +age + "\ncontact: " + contact + "\naddress: " +address);
    }

}
