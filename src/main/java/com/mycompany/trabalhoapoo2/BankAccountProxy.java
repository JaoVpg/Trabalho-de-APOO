
package com.mycompany.trabalhoapoo2;
public class BankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount;
    private String userRole;

    public BankAccountProxy(String userRole) {
        this.realBankAccount = new RealBankAccount();
        this.userRole = userRole;
    }

    @Override
    public void deposit() {
        if (checkAccess()) {
            realBankAccount.deposit();
            logAccess("Depositado");
        }
    }

    @Override
    public void withdraw() {
        if (checkAccess()) {
            realBankAccount.withdraw();
            logAccess("retirar");
        }
    }

    private boolean checkAccess() {
        if ("Admin".equals(userRole)) {
            return true;
        } else {
            System.out.println("Acesso negado. Permissoes insuficientes.");
            return false;
        }
    }

    private void logAccess(String operation) {
        System.out.println("Operacao " + operation + " realizado pelo usuario com funcao: " + userRole);
    }
}

