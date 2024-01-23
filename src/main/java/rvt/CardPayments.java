package rvt;

public abstract class CardPayments {
    public static class PaymentCard {
        private double balance;
    
        public PaymentCard(double balance) {
            this.balance = balance;
        }
    
        public double balance() {
            return this.balance;
        }
    
        public void addMoney(double increase) {
            this.balance = this.balance + increase;
        }
    
        public boolean takeMoney(double amount) {
            if (amount <= this.balance) {
                this.balance -= amount;
                return true; 
            } else {
                return false; 
            }
        }
    }
    
    public class MainProgram {
        public static void main(String[] args) {
            PaymentCard petesCard = new PaymentCard(10);
            System.out.println("money " + petesCard.balance());
            boolean wasSuccessful = petesCard.takeMoney(8);
            System.out.println("successfully withdrew: " + wasSuccessful);
            System.out.println("money " + petesCard.balance());
    
            wasSuccessful = petesCard.takeMoney(4);
            System.out.println("successfully withdrew: " + wasSuccessful);
            System.out.println("money " + petesCard.balance());
        }
    }
}

    

