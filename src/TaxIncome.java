import javax.swing.*;

public class TaxIncome {
    public static void main(String[] args) {
     String Name, Income;
     float IncomeAsFloat=0f, GrossIncome=0f, TaxRate=0f, Tax=0f, IncomeAfterTax=0f;

        Name = JOptionPane.showInputDialog("Please enter your Name:");
        Income = JOptionPane.showInputDialog("Please enter your Income:");

        Income = Float.toString(IncomeAsFloat);

        if(IncomeAsFloat >=20.000f)
        {
            TaxRate = 0f;
            GrossIncome = IncomeAsFloat;
            IncomeAfterTax = IncomeAsFloat;
            Tax = IncomeAfterTax;
        }


        JOptionPane.showMessageDialog(null,"Gross Income: " + GrossIncome +
                "\nTax Rate: " + TaxRate + "%"+  "\nTax: " + Tax + "\nIncomeAfterTax: " + IncomeAfterTax);
    }
}
