package com.dmdev.lesson11.homework6;

public class ATM {
    private int amount10;
    private int amount20;
    private int amount50;

    public ATM(int amount10, int amount20, int amount50) {
        this.amount10 = amount10;
        this.amount20 = amount20;
        this.amount50 = amount50;
    }

    public int addMoney(AddMoney addMoney) {
        amount50 += addMoney.getAddMoney() / 50;
        amount20 += addMoney.getAddMoney() % 50 / 20;
        amount10 += addMoney.getAddMoney() % 50 % 20 / 10;
        return addMoney.getAddMoney();
    }


    public boolean paymentMoney(Payment payment) {
        return (amount10 * 10) + (amount20 * 20) + (amount50) >= payment.getPaymentMoney();
    }

    public void print(Payment paymentMoney) {
        if (paymentMoney(paymentMoney)) {
            amount50 = paymentMoney.getPaymentMoney() / 50;
            amount20 = paymentMoney.getPaymentMoney() % 50 / 20;
            amount10 = paymentMoney.getPaymentMoney() % 50 % 20 / 10;
            System.out.println("Купюры по 50: " + amount50 + " шт.");
            System.out.println("Купюры по 20: " + amount20 + " шт.");
            System.out.println("Купюры по 10: " + amount10 + " шт.");
        } else {
            System.out.println("Недостаточно денег в банкомате");
        }
    }

    public int getAmount10() {
        return amount10;
    }

    public void setAmount10(int amount10) {
        this.amount10 = amount10;
    }

    public int getAmount20() {
        return amount20;
    }

    public void setAmount20(int amount20) {
        this.amount20 = amount20;
    }

    public int getAmount50() {
        return amount50;
    }

    public void setAmount50(int amount50) {
        this.amount50 = amount50;
    }
}
