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
                this.money = 1000.0;
            }
            public void addMoneyToCard(PaymentCard card, double sum) {
                card.addMoney(sum);
                this.money+=sum;
    
            }
            public double eatAffordably(double payment) {
                double affordableMeal2 = 2.50;
                
                if (payment >= affordableMeal2) {
                    this.money += affordableMeal2;
                    affordableMeals++;
                    return payment - affordableMeal2;
                } else {
                    return payment; 
                }
            }
        
            public double eatHeartily(double payment) {
                double heartyMeal2 = 4.30;

                if (payment >= heartyMeal2) {
                    this.money += heartyMeal2;
                    heartyMeals++;
                    return payment - heartyMeal2; 
                } else {
                    return payment;
                }
            }
            public boolean eatAffordably(PaymentCard card) {
                double affordableMeal3 = 2.50;
                if(card.takeMoney(affordableMeal3)){
                    affordableMeals++;
                    return true;
                } else{
                    return false;
                }
            }
        
            public boolean eatHeartily(PaymentCard card) {
                double heartyMeal3 = 4.30;

                if (card.takeMoney(heartyMeal3)) {
                    heartyMeals++; 
                    return true; 
                } else {
                    return false; 
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
        }
    }
}

    

