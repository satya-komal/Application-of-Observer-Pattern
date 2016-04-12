package studentRecordsBackup.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import studentRecordsBackup.bst.BST;
import studentRecordsBackup.bst.Node;
/**
 * @author SatyaKomal
 *
 */
public class BSTBuilder {
    
  BST bst = new BST();
  public static  BST backup1 = new BST();
  public static  BST backup2 = new BST();
    
	/**
	 * readLine is a function to read each line from the given file.txt
	 * If the given line is not null,then the readLine function inserts the value it read from line into insert function 
	 * in the BST Class
	 */
	public void readLine(String a) throws IOException {
		
		BufferedReader br =null;
		try {
			br = new BufferedReader( new FileReader (a));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			if(br!=null){
				String curLine = br.readLine();
			while (curLine != null){
				try{
				int val = Integer.parseInt(curLine);
				bst.insert(val);
				backup1.insert(val);
				backup2.insert(val);
				curLine = br.readLine();
				}
				catch(NumberFormatException e){
					
				}
				
			}
		 }
		}		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		        br.close();
		}
        
	}
	/**
	 * printInorderNode calls the printInorder function in BST Class 
	 */
	
	public void printInorderNode(){
		System.out.println("Inorder of main tree is");
		bst.printInorder(bst.root);
		System.out.println();
		System.out.println("Inorder of Backup1");
		backup1.printInorder(backup1.root);
		System.out.println();
		System.out.println("Inorder of Backup2");
		backup2.printInorder(backup2.root);
		System.out.println();
	}
	/**
	 * bSUM function calls the printBSUM function in BST Class
	 */
	public void bSUM(){
		bst.printBSUM(bst.root);
		System.out.println();
		System.out.println("Sum of all Bno's is :"+ bst.getSum());
		bst.setSum(0);
		
		backup1.printBSUM(backup1.root);	
		System.out.println("Sum of all Bno's in backup1 is :"+ backup1.getSum());
		backup1.setSum(0);

		backup2.printBSUM(backup2.root);	
		System.out.println("Sum of all Bno's in backup1 is :"+ backup2.getSum());
		backup2.setSum(0);
        System.out.println();
	}
	/**
	 * findMax calls teh maxValue function in BST
	 */
	public void findMax(){
		bst.maxValue(bst.root);
	}
	/**
	 * increment function calls the increase function in BST Class
	 */
	public void increment(int i){
		Node node = new Node(i);
		bst.increase(i,bst.root);
		node.update(i);
	}
}
