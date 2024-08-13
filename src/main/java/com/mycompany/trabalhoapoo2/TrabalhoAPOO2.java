

package com.mycompany.trabalhoapoo2;


public class TrabalhoAPOO2 {
     public static void main(String[] args) {
        BankAccount adminAccount = new BankAccountProxy("Admin");
        adminAccount.deposit();  
        adminAccount.withdraw(); 

        BankAccount userAccount = new BankAccountProxy("User");
        userAccount.deposit();   
        userAccount.withdraw();  
    }
}

