package rvt;

import rvt.CardPayments.PaymentCard.PaymentTerminal;

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
        public static class PaymentTerminal {
            private double money;  
            private int affordableMeals; 
            private int heartyMeals;  
            
            public PaymentTerminal() {
                money = 1000.0;
                affordableMeals = 0;
                heartyMeals = 0;
            }
        
            public double eatAffordably(double payment) {
                double affordableMealPrice = 2.50;
                if (payment >= affordableMealPrice) {
                    this.money += affordableMealPrice;
                    affordableMeals++;
                    return payment - affordableMealPrice;
                } else {
                    return payment; 
                }
            }
        
            public double eatHeartily(double payment) {
                double heartyMealPrice = 4.30;

                if (payment >= heartyMealPrice) {
                    this.money += heartyMealPrice;
                    heartyMeals++;
                    return payment - heartyMealPrice; 
                } else {
                    return payment;
                }
            }
        
            public String toString() {
                return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
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
            PaymentTerminal unicafeExactum = new PaymentTerminal();

            double change = unicafeExactum.eatAffordably(10);
            System.out.println("remaining change " + change);

            change = unicafeExactum.eatAffordably(5);
            System.out.println("remaining change " + change);

            change = unicafeExactum.eatHeartily(4.3);
            System.out.println("remaining change " + change);

            System.out.println(unicafeExactum);
        }
    }
}

    

