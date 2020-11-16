package runner;

import models.Array;

public class Runner {

    public static void main(String[] args) {
        Array array = new Array(new int[]{5,15,12,18,28});
        System.out.println(array.standardDeviation());
        }
}