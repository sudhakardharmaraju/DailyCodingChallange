package day8;

class Node{
	int val;
	Node left;
	Node right;
	
	Node(int val,Node left,Node right){
		this.val =val;
		this.left = left;
		this.right = right;
		
	}
	Node(int val){
		this.val =val;
		this.left = null;
		this.right = null;
	}
	
	
}

public class Answer8 {

	private int count_unival_subtrees(Node root) {
		
		if (root == null) {
            return 0;
        }
		
		int count = count_unival_subtrees(root.left) + count_unival_subtrees(root.right);

		if (root.left != null && root.val != root.left.val) {
            return count;
        }
		
		if (root.right != null && root.val != root.right.val) {
            return count;
        }

        // if whole tree is unival tree
        return count + 1;
	}
	
	public static void main(String args[]){
		
		Node root = new Node(0,new Node(1),new Node(0,new Node(1,new Node(1),new Node(1)),new Node(0)));
		
		System.out.println(new Answer8().count_unival_subtrees(root));
		
	}
	
}
