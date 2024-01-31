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
        int smallIndex=0;
        for(int i=1; i<array.length;i++){
            if(array[i]<array[smallIndex]){
                smallIndex=i;
            }
        } 
        return smallIndex;  
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex){
       int minSk=table[startIndex];
       int minIndex=startIndex;
       for(int i=startIndex; i<table.length;i++){
            if(table[i]<minSk){
                minIndex=i;
            }
       } 
       return minIndex;
    }
    public static void swap(int[] array, int index1, int index2) {
        int arr=array[index1];
        array[index1]=array[index2];
        array[index2]=arr;    
    } 
    public static void sort(int[] array) {

    }  
}