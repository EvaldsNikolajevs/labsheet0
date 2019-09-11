import javax.swing.*;
import java.util.Scanner;

public class SnackDeal {
    public static void main(String[] args) {
        String Name , Class , Snacks;
        int Cost , SnacksAsInt;

        Name = JOptionPane.showInputDialog("Please enter your name:");
        Class = JOptionPane.showInputDialog("Please enter your class name");
        Snacks = JOptionPane.showInputDialog("Please enter the number of snacks that you would like");

        SnacksAsInt = Integer.parseInt(Snacks);

        Cost = SnacksAsInt * 2;

        JOptionPane.showMessageDialog(null,"Name : " + Name + "\nClass : "
                + Class + "\nNumber of snacks : " + Snacks + "\nCost of snacks : " + Cost);
    }
}
