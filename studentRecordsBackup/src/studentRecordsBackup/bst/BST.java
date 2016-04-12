package studentRecordsBackup.bst;

public class BST{
private int sum=0;
	public Node root;
	
	public BST(){
		root =null;
	}
    
	@SuppressWarnings("unused")
	/**
	 * insert function inserts the values coming from BSTBuilder into a BST  
	 */
	public void insert(int id){
		Node newNode = new Node(id);
		if(root==null){
			root = newNode;
			return;
		}
		else{
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id<current.BNo){				
				current = current.left;
				if(current==null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = newNode;
					return;
				}
			}
		  }
		}
	}
	
	/**
	 * Prints the values in Binary Search Trees in inOrder 
	 */
	public void printInorder(Node node){
		if (node!=null){
			printInorder(node.left);
			System.out.print(node.BNo+ " ");
			printInorder(node.right);
		}
	}
	/**
	 * Prints the sum of all the values present in the nodes of Binary Search Trees
	 */
	public void printBSUM(Node node){
		
		if (node!=null){
			printBSUM(node.left);
            setSum(getSum()+ node.BNo);
			printBSUM(node.right);
		}
	}

	/**
	 * increases the value of the node in BST according to the given rules. 
	 * In main BST, max value is incremented by 2*updated value
	 */
	public void increase(int v,Node node){
		if (node!=null){
			if(node.max_val==true) node.BNo =node.BNo+2*v;
			else{
			increase(v,node.left);
            node.BNo = node.BNo+ v;
            increase(v,node.right);
			}
		}
	}

	/**
	 * A method to find the max value present in the BST
	 */
	public void maxValue(Node node){
		if (node!=null){
			maxValue(node.right);
			if(node.right==null) {
				node.max_val= true;
			}
		}
	}

	/**
	 * Method to increment the values in BST backup trees
	 */
	public void incBackuprec(int up,Node node){
		if (node!=null){
			incBackuprec(up,node.left);
            node.BNo = node.BNo+ up;
            incBackuprec(up,node.right);
		}
	}

	/**
	 * method which calls method to increment values in backup trees
	 */
	public void incBackup(int a){
		incBackuprec(a,root);
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
