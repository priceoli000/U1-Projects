import javax.swing.*;

public class RPGCharacter {
    public static void main(String[] args) {
    int strength = Integer.parseInt(JOptionPane.showInputDialog("What is the strength? (Out of 10)"));
    int speed = Integer.parseInt(JOptionPane.showInputDialog("What is the speed? (Out of 10)"));
    int spirit = Integer.parseInt(JOptionPane.showInputDialog("What is the spirit? (Out of 10)"));
    int iq = Integer.parseInt(JOptionPane.showInputDialog("What is the IQ? (Out of 10)"));

    int dmgAttack = strength * 100;
    int strikeSpd = speed * 100;
    int spellStrength = spirit * 100;
    int fightingTech = iq * 100;

    JOptionPane.showMessageDialog(null, "\nThe character's strength is: " + strength + "\n The speed is: " + speed + "\nThe character's spirit is: " + spirit + "\nThe character's IQ is: " + iq + "\nThe attack damage is: " + dmgAttack + "\nThe striking speed is: " + strikeSpd + "\nThe spell strength is: " + spellStrength + "\nThe fighting capability is: " + fightingTech);


    System.exit(0);
    }








    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
}
