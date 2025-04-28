
//W.A.J.P. to create a custom exception if Customer withdraw amount 
//which is greater than account balance then program will show custom 
//exception otherwise amount will deduct from account balance.
//Account balance is:2000 Enter withdraw 
//amount:2500
//Sorry, insufficient balance, you need more 500 Rs.To perform 
//this transaction.

package Module6;

import java.util.Scanner;

//Custom Exception class
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(int amount) {
     super("Sorry, insufficient balance, you need more " + amount + " Rs. to perform this transaction.");
 }
}

//BankAccount class with withdraw method
class BankAccount {
 private int balance = 2000;

 public void withdraw(int amount) throws InsufficientBalanceException {
     if (amount > balance) {
         int shortage = amount - balance;
         throw new InsufficientBalanceException(shortage);
     } else {
         balance -= amount;
         System.out.println("Transaction successful. Remaining balance: " + balance + " Rs.");
     }
 }
}

//Main class
public class P27_Withdrawal {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     BankAccount account = new BankAccount();

     System.out.println("Account balance is: 2000 Rs.");
     System.out.print("Enter withdraw amount: ");
     int amount = scanner.nextInt();

     try {
         account.withdraw(amount);
     } catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     }

     scanner.close();
 }
}

