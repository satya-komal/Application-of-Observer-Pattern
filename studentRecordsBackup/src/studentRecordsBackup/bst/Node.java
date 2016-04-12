package studentRecordsBackup.bst;
import java.util.Vector;

import studentRecordsBackup.util.BSTBuilder;
import studentRecordsBackup.util.EvenFilterImpl;
import studentRecordsBackup.util.OddFilterImpl;


public class Node implements ObserverI,SubjectI {
	public Vector <ObserverI> ob = new Vector<ObserverI>(2,2);
	
	    public int BNo;
	    public Node left;
	    public Node right;
	    boolean max_val;
	    
	    /** Default Constructor of Node Class
	     */
	    public Node (int BNo) {
	        this.BNo = BNo;
	        right = null;
	        left = null;
	        max_val =false;
	    }
	    
	    public void setBNo(int BNo) {
	        this.BNo = BNo;
	    }

	    public int getBNo() {
	        return BNo;
	    }

	    public void setLeft(Node left) {
	        this.left = left;
	    }

	    public Node getLeft() {
	        return left;
	    }

	    public void setRight(Node right ) {
	        this.right = right;
	    }

	    public Node getRight() {
	        return right;
	    }
	    /**
	     *  Increments the value of BNo by update value passed from driver bu following certain rules
	     *  and calls the notifyObservers method 
	     */
		@Override
		public void update(int val) {
        this.BNo= BNo+val;
        notifyObservers(val);
		}
		
		/**
		 * Adds the observers to the end of vector data structure
		 */
		@Override
		public void registerObserver(ObserverI observer) {
			ob.add(observer);
		}
		
	    OddFilterImpl of = new OddFilterImpl();
	    EvenFilterImpl ef = new EvenFilterImpl();
		
	    /**
	     * calls the Odd / Even Interface implementation classes and checks 
	     * if the passed value is odd/even values and update the backup trees accordingly
	     */
	    @Override
		public void notifyObservers(int update) {
			 int odd  = of.checkInt(update);		 
			 if(odd==1){ 
					BSTBuilder.backup2.incBackup(update); 
					 }
			  
			 else{
				 int even = ef.checkInt(update);
				 if(even==1){
					 BSTBuilder.backup1.incBackup(update);
				 }
			}
		}
}
