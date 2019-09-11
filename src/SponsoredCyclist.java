import javax.swing.*;

public class SponsoredCyclist {
    public static void main(String[] args) {
        String ForeName, SureName, Initial, DistanceCycled, MoneyDueAsString="";
        int DistanceCycledAsInt;
        Float MoneyDue=0f;

        ForeName = JOptionPane.showInputDialog("Please enter your forename : ");
        SureName = JOptionPane.showInputDialog("Please enter your surename : ");
        Initial = JOptionPane.showInputDialog("Please enter your Initial : ");
        DistanceCycled = JOptionPane.showInputDialog("Please enter The distance you cycled : ");

        DistanceCycledAsInt = Integer.parseInt(DistanceCycled);

        if(DistanceCycledAsInt <= 10 )
        {
            MoneyDue = 0.07f * DistanceCycledAsInt;

        }

        else
        {
         DistanceCycledAsInt = DistanceCycledAsInt -10;

         MoneyDue = 0.7f + DistanceCycledAsInt * 0.1f;
        }

        MoneyDueAsString = Float.toString(MoneyDue);

        JOptionPane.showMessageDialog(null,"Name : " + ForeName + " " + SureName +
                "\nInitial : " + Initial + "\nDistance Cycled : " + DistanceCycled + "KM" + "\nMoney Due : " + MoneyDueAsString);
    }
}
