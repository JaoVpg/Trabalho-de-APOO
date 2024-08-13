
package com.mycompany.trabalhoapoo2;


public class RealBankAccount implements BankAccount {
    private double balance;

    public RealBankAccount() {
        this.balance = 1000.0; 
    }

    @Override
    public void deposit() {
        double depositAmount = 100.0; 
        balance += depositAmount;
        System.out.println("Depositado " + depositAmount + ". Novo saldo: " + balance);
    }

    @Override
    public void withdraw() {
        double withdrawAmount = 50.0;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("Retirou-se " + withdrawAmount + ". Novo saldo: " + balance);
        } else {
            System.out.println("Fundos insuficientes. Retirada negada.");
        }
    }
}