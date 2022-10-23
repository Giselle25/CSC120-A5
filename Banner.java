/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;

    }

    /*
     * Prints out a banner that resizes based on the message 
     */
    public void display() {
        int messageSize= this.message.length();
        System.out.print("    ");
        for (int i =0; i< messageSize; i++) {
            System.out.print("*");
            System.out.print("."); 
             } 
        System.out.println();
        System.out.print("  ---");
        for (int i =0; i< messageSize; i++) {
            System.out.print("--");
        }
        System.out.println();
        System.out.print(" ~~ ");
        for (int i =0; i< messageSize; i++) {
            System.out.print("**");
        }
        System.out.print(" ~~");
        
        System.out.println();
        for (int i =1; i<messageSize; i++) {
            System.out.print("*");
        }
        
        System.out.print(this.message);
        for (int i =1; i<messageSize; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(" ~~ ");
        for (int i =0; i< messageSize; i++) {
            System.out.print("**");
        }
        System.out.print(" ~~");
        System.out.println();
        System.out.print("  ----");
        for (int i =0; i< messageSize; i++) {
            System.out.print("--");
        }
    
        System.out.println();
        System.out.print("   ");
        for (int i =0; i< messageSize; i++) {
            System.out.print("*");
            System.out.print(".");
        }
        System.out.println();
        System.out.println("               ******");
        System.out.println("                ***");
        System.out.println("                 *");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner(" Hello World ");
        myBanner.display();
    }
}
