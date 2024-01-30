package rvt;

public abstract class Sorter {
    public static int smallest(int[] array){
       int small=array[0];
       for (int x : array) {
        if(x<small){
            small=x;
            
        }
       }
       return small;
    }  
    public static int indexOfSmallest(int[] array){
        
    }
}