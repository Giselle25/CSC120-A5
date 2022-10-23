/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * Prints ASCII art depicting a boots to the console
     */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.println("    ,|___|, ");
          System.out.println("     |===|  ");
          System.out.println("     |   |  ");
          System.out.println("     /  &|  ");
          System.out.println("   .-'` ,)  ");
          System.out.println("  `------`  ");


        } else if (this.direction.equals("right")) {
          System.out.println("            ,|___|,");
          System.out.println("             |===|");
          System.out.println("             |   |");
          System.out.println("             |&  \\");
          System.out.println("             (,  `'-.");
          System.out.println("             `-------");
        } else {
          System.out.println("Which boot?");
        }

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}




