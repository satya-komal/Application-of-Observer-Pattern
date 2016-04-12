package studentRecordsBackup.util;


public  class OddFilterImpl implements OddEvenFilterI {
	/**
	 *  checkInt function checks if the passed integer is odd and returns 1 if it is 
	 */      
	public int checkInt(int a ){
        	  int b=0;
        	  if(a%2!=0) {
        		  b=1;
        	  }
        	  return b;
          }
}
