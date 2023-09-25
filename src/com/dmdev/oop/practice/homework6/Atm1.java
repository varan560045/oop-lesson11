package com.dmdev.lesson11.homework6;

public class Atm1 {
    public static void main(String[] args) {

        ATM atm1 = new ATM(5, 8, 100000);
        AddMoney addMoney = new AddMoney(10);
        Payment paymentMoney = new Payment(10000000);
        atm1.addMoney(addMoney);
        System.out.println(atm1.paymentMoney(paymentMoney));
        atm1.print(paymentMoney);

    }
}
