import javax.swing.*;
import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String noun, pluralNoun, noun2, place, adjective, noun3;


        System.out.println("Type in a noun!");
        noun = read.nextLine();
        System.out.println("Type in a plural noun!");
        pluralNoun = read.nextLine();
        System.out.println("Type in another noun!");
        noun2 = read.nextLine();
        System.out.println("Type in a place");
        place = read.nextLine();
        System.out.println("Type in an adjective");
        adjective = read.nextLine();
        System.out.println("Type in the last noun");
        noun3 = read.nextLine();

        System.out.println("Be kind to your " + noun + ("-footed " + pluralNoun + ", For a duck may be somebody's " + noun2));
        System.out.println("Be kind to your " + pluralNoun + " in " + place + " Where the weather is always " + adjective + ".");
        System.out.println("You may think that this is the " + noun3 + " Well it is.");



    }
    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
}