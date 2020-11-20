package Test;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
/**
 * @author Carlos Hernado Lozano
 * @author Esteban Ruiz 
 * @author Jose Misael Paez
 * @author Diego Alejandro Rubiano
 * @author Diego Mauricio Sierra
 * 
 * 
 */
public class Test {

    private Scanner scanner;
    private int picas, fijas;
    private int longitude;
    
    private int[] arrayOne;
    private int[] arrayTwo;
    
    public Test(){
        scanner = new Scanner(System.in);
        longitude = scanner.nextInt();
        picas = 0;
        fijas = 0;
        arrayOne = new int[longitude];
        arrayTwo = new int[longitude];
        
    }
    
    public void baseNumbers(){
    
        for (int i = 0; i < longitude; i++) {
            System.out.println("Ingrese el numero " + i + " de los numeros a adivinar");
            arrayOne[i] = scanner.nextInt();
        }
    }
    
    public void setArrays(){
    System.out.println("Cual va a ser la longitud del juego ");
        for (int i = 0; i < longitude; i++) {
            System.out.println("Ingrese el numero a jugar   ");
            System.out.println("ingrese el numero " + i + " de los numeros adivinadores");
            arrayTwo[i] = scanner.nextInt();
        }
    }
    /**
     * Verifica si son fijas
     */
    public void verifyFijas(){
        for (int i = 0; i < longitude; i++) {
            if (arrayTwo[i] == arrayOne[i]) {
                fijas += 1;
            }
        }
        System.out.println("Dijitos fijos " + fijas);
    }
    /**
     * Verifica si son picas
    */
    public void verifyPicas(){
        for (int i = 0; i < longitude; i++) {
            for (int j = 0; j < longitude; j++) {
                if (arrayTwo[i] == arrayOne[j]&&arrayTwo[i]!=arrayOne[i]) {
                    picas += 1;
                }
            }
        }
        System.out.println("Picas " + picas);
    }
    public void printResult() {
        System.out.println("deacuerdo a los numeros hay: "+this.fijas+" fijas.");
        System.out.println("deacuerdo a los numeros hay: "+this.picas+" picas.");
    }
    
    public static void main(String[] args) {
        
        Test test = new Test();
        
        test.baseNumbers();
        test.setArrays();
        test.verifyFijas();
        test.verifyPicas();
        
        test.printResult();

        //for (int i = 0; i < arrayOne.length; i++) {
        //   if (arrayOne[i] == arrayTwo[i]) fijas++;
        //    for (int k = 0; k < arrayOne.length; k++) {
        //        int value = arrayOne[i];
        //        for (int j = 0; j < arrayTwo.length; j++) if (value == arrayTwo[i]) picas++;
        //    }
        //}
    }

}
