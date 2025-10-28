class LowBalanceException extends Exception {
    LowBalanceException(String message) {
       super(message);
    }
}

public class Bank {
    public static void main(String[] args) {
        int balance = 1000;
        int withdrawAmount = 500;

        try {
            if (withdrawAmount > balance) {
         
              throw new

LowBalanceException("Insufficient balance to withdraw!");
          } else {
              balance -= withdrawAmount;
              System.out.println("withdrawal successful! remaining balance : "  + balance);
         }
}
catch (LowBalanceException e) {
      System.out.println("Exception: " + e.getMessage());
}
finally {
      System.out.println("Thank you for using our banking service!");
  }
 }
}
