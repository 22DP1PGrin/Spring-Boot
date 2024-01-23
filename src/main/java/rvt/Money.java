package rvt;
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

     public Money(){
         this.euros=0;
         this.cents=0;
    }
    
    public Money(int e){
        this.euros=e;
        this.cents=0;
    }
    public int euros() {

        return euros;
    }

    public int cents() {

        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();
        if (newCents >= 100){
            newEuros++;
            newCents -= 100;
        }
        Money newMoney = new Money(newEuros, newCents); 
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
            if(this.euros==compared.euros){
                if(this.cents>compared.cents){
                    return false;
                }
                else{
                    return true;
                }
            
            }
            else{
                if(this.euros>compared.euros){
                return false;
            }else{
                return true;
            }
        }
    }
    public Money minus(Money decreaser){
        int Eur;
        int Cents;
        if(this.euros - decreaser.euros<0){
            Money newMoney = new Money();
            return newMoney;
    
        }
        Eur = this.euros-decreaser.euros;
        if(this.cents-decreaser.cents<0){
            Eur--;
            Cents=100-(decreaser.cents-this.cents);
            Money newMoney = new Money(Eur, Cents);
            return newMoney;
        }    
        Cents=this.cents-decreaser.cents;
        Money newMoney=new Money(Eur, Cents);
        return newMoney;

    }
    public static void main(String[] args){
        Money macins1 = new Money(17,54);
        
        Money macins2 = new Money(15,14);

        Money macins3 = macins1.plus(macins2);
        
        Money macins4 = macins1.minus(macins2);
        //System.out.println(macins1);  
        //System.out.println(macins2);  
        //System.out.println(macins3); 
        System.out.println(macins4);
        
        macins4 = macins4.minus(macins1);
        //System.out.println(macins1);  
        //System.out.println(macins2);  
        //System.out.println(macins3);
        //System.out.println(macins4);
        //System.out.println(macins1.toString());
        //System.out.println(macins2.toString());
        //System.out.println(macins3.toString());
        //System.out.println(macins1.lessThan(macins2));  
        //System.out.println(macins2.lessThan(macins3));
    }
}