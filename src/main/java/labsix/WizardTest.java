package labsix;

import java.io.File;
import java.io.FileNotFoundException;
/*
 * TODO: Import correct packages and classes for:
 *       - Scanner
 *       - Random
 */

/** Helps G. Wiz generate test questions.
 *
 * @author Solution Repository
 */
public class WizardTest {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {    
    // Start the generator
    System.out.println("WIZARD TEST QUESTION GENERATOR");
    System.out.println();
    
    // Set up file input
    File file = null;
    Scanner fileInput = null;
    try {
      file = new File("input/test.question");
      fileInput = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    String question = fileInput.nextLine();
    
    /*
     * TODO: Initialize a Scanner object to read from
     *       the keyboard
     */

    /*
     * TODO: Use the replace method of String to replace the 
     *       "tokenized" placeholders (e.g. {PLACE}) with input
     *       from user prompts
     */
 
    
    // TODO: Intialize a Random object
    
    // Generate random numbers
    
    /*
     * TODO: Use appropriate methods of Random to replace the 
     *       "tokenized" placeholders (e.g. {AMOUNT}) with
     *       random numbers
     */
    
    System.out.println();
    
    /*
     * TODO: Calculate the question's answer (hint: this also
     *       requires casting)
     */
    
    // Print the question with substitutions made

    System.out.println(question);
    System.out.println();
    System.out.println("> " + answer);
  }
}