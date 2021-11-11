package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);

        while (true) {
            try {
                bankAccount.withDraw(6000);

            }catch (LimitException e) {
                System.out.println(e.getMessage());

                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                    System.out.println("У вас не осталось денег на счету");

                } catch (LimitException limitException) {
                    System.out.println(limitException.getMessage());
                }
                break;
            }
        }
    }
}
