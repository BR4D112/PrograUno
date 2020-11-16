package models;


public class Array {
    private int []array;
    public Array(int []array){
        this.array = array;
    }
    public double calculateMid(){
        double mid = 0;
        for (int i = 0; i<array.length;i++) mid += array[i];
        return mid/array.length;
    }
    public double standardDeviation(){
        double sum = 0;
        double average = calculateMid();
        for (int i = 0; i<array.length;i++) sum+=Math.pow(array[i]-average,2);
        return Math.sqrt(sum/(array.length-1));
    }
}