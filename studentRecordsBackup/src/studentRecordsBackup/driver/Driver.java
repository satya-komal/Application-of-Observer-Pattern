/**
 * @author SatyaKomal
 */
package studentRecordsBackup.driver;

import java.io.IOException;

import studentRecordsBackup.bst.BST;
import studentRecordsBackup.util.BSTBuilder;
import studentRecordsBackup.util.OddFilterImpl;

public class Driver {

	/**
	 * @param args
	 * @throws IOException
	 * reads command line arguments and calls the specific methods according to the program requirement
	 */
	public static void main(String[] args) throws IOException {
      
		if (args.length !=2)      {
    	   System.err.println("Error in running the program");
    	   System.out.println("There has to be two command line arguments.-- an input text file followed by an integer");
       }
       else {
    	   BSTBuilder bb = new BSTBuilder();
    	   BST bst = new BST();
    	   OddFilterImpl oddf = new OddFilterImpl();
    	   
    	   bb.readLine(args[0]);
    	   bb.printInorderNode();
    	   bb.bSUM();
    	   bst.setSum(0);
    	   bb.findMax();
    	   int u = Integer.parseInt(args[1]);
    	   bb.increment(u);
    	   System.out.println("After passing the update value");
    	   bb.findMax();
    	   bb.printInorderNode();
    	   bb.bSUM();
       }
	}
}
