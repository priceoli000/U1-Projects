import javax.swing.*;

public class MadLib {
    public static void main(String[] args) {
        String noun, pluralNoun, noun2, place, adjective, noun3;


        noun = JOptionPane.showInputDialog("Type in a noun!");
        pluralNoun = JOptionPane.showInputDialog("Type in a plural noun!");
        noun2 = JOptionPane.showInputDialog("Type in another noun!");
        place = JOptionPane.showInputDialog("Type in a place");
        adjective = JOptionPane.showInputDialog("Type in an adjective");
        noun3 = JOptionPane.showInputDialog("Type in the last noun");

        JOptionPane.showMessageDialog(null, "Be kind to your " + noun +"-footed " + pluralNoun + " For a duck may be somebody's " + noun2 + ", Be kind to your " + pluralNoun + " in " + place + " Where the weather is always " + adjective + "." + " You may think that this is the " + noun3 + ", Well it is.");


    }
    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
}