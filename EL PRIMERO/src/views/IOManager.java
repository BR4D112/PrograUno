package views;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class IOManager {
    public static final String MESSAGE_FIRST = "Bienvenido, ingrese la primera fecha";

    public int getHours(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }
    public int getMinutes(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(null,message));
    }
    public int getSeconds(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }
    public void showResult(String message){
        JOptionPane.showMessageDialog(null,message);
    }

}
