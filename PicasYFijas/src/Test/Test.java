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
        Scanner scanner = new Scanner(System.in);
        int picas = 0, fijas = 0;
        int longitude = scanner.nextInt();
        int[] arrayTwo = new int[longitude];
        int[] arrayOne = new int[longitude];
    public static void main(String[] args) {




        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == arrayTwo[i]) fijas++;
            for (int k = 0; k < arrayOne.length; k++) {
                int value = arrayOne[i];
                for (int j = 0; j < arrayTwo.length; j++) if (value == arrayTwo[i]) picas++;
            }
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
    public void verifyFijas(){
        //Verifica si son fijas
        for (int i = 0; i < longitude; i++) {
            if (arrayTwo[i] == arrayOne[i]) {
                fijas += 1;
            }
        }
        System.out.println("Dijitos fijos " + fijas);
    }
    public void verifyPicas(){
        //Verificar picas
        for (int i = 0; i < longitude; i++) {
            for (int j = 0; j < longitude; j++) {
                if (arrayTwo[i] == arrayOne[j]&&arrayTwo[i]!=arrayOne[i]) {
                    picas += 1;
                }
            }
        }
        System.out.println("Picas " + picas);
    }
    public void baseNumbers(){

        for (int i = 0; i < longitude; i++) {
            System.out.println("Ingrese el numero " + i + " de los numeros a adivinar");
            arrayOne[i] = scanner.nextInt();
        }
    }


}
