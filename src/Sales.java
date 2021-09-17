import jdk.nashorn.internal.scripts.JO;


import javax.swing.*;

public class Sales {
    public static void main(String[] args) {
        int discount, quantity, tax, price;
        price = Integer.parseInt(JOptionPane.showInputDialog("What was the price?"));
        discount = Integer.parseInt(JOptionPane.showInputDialog("What was the discount?"));
        quantity = Integer.parseInt(JOptionPane.showInputDialog("How many did you buy?"));
        tax = Integer.parseInt(JOptionPane.showInputDialog("What is the sales tax?"));

        double beforeTax = (discount/100.0) * price;
        double beforeTax2 = price - beforeTax;
        double quantPrice = beforeTax2 * quantity;
        double lastTax = price * (tax/100);
        double truePrice = quantPrice + lastTax;

       JOptionPane.showMessageDialog(null, "Your total with tax is: $" + truePrice);



    }

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
}
