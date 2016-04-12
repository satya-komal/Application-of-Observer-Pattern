package studentRecordsBackup.util;

import java.util.Vector;

public class EvenFilterImpl implements OddEvenFilterI {
	/**
	 *  checkInt function checks if the passed integer is even and returns 1 if it is 
	 */      
	public int checkInt(int a ){
  	  int c=0;
		if(a%2==0){
  		  c=1;
  	  }
		return c;
    }
}
