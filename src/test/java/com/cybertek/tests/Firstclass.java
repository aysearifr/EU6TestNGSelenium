package com.cybertek.tests;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class Firstclass {
    private Faker faker;

    public static void main(String[] args) {
        System.out.println("Hello World");

        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.harryPotter().character());
        System.out.println(faker.finance().creditCard(CreditCardType.AMERICAN_EXPRESS));

    }


}
