/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pants {

    /*
     * Prints ASCII art depicting a pants to the console
     */
    public void display() {
        
        System.out.println( "     |_____________|");
        System.out.println( "     [_I_I[L]=_I_I_] ");
        System.out.println( "     |     | :     | ");
        System.out.println( "     |    ||  |    | ");
        System.out.println( "     |   | '-  |   | ");
        System.out.println( "     |   | |^| |   | ");
        System.out.println( "     |   | | | |   | ");
        System.out.println( "     |   | | | |   | ");
        System.out.println( "     |   | | | |   | ");
        System.out.println( "     |   | | | |   | ");
        System.out.println( "     |  -|-| |-|-  | ");
        System.out.println( "     |   | | | |   | ");
        System.out.println( "     |   | | | |   | "); 
        System.out.println( "     |   | | | |   | ");
        System.out.println( "     |___|_| |_|___| "); 
        System.out.println( "     [____]   [____] ");

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
