package day3;

import java.util.LinkedList;
import java.util.Queue;

public class Answer3 {
	
	public static String serialize(Node node)
    {
        if (node == null)
        {
            return " "+"-";
        }

        StringBuilder builder = new StringBuilder();

        
        builder.append(node.value+"-");

        builder.append(serialize(node.left));
        builder.append(serialize(node.right));

        return builder.toString();
    }

	 public static Node Deserialize(String serializedNode)
     {
         String[] nodes = serializedNode.split("-");
        		 
        		 
            

         Queue<String> queue = new LinkedList<String>();
         for (int i=0; i<nodes.length; i++) 
        	 queue.add(nodes[i]); 

         Node node = DeserializeNode(queue);

         return node;
     }
	 
	 private static Node DeserializeNode(Queue<String> nodes)
     {
         if (nodes.peek() != null)
         {
             String nextNode = nodes.poll();

             if (nextNode == " ")
             {
                 return null;
             }

             Node node = new Node(nextNode);

             node.left = DeserializeNode(nodes);

             node.right = DeserializeNode(nodes);

             return node;
         }

         return null;
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node = new Node("Root", new Node("left", new Node("left.left"), null), new Node("right"));
		
		String serialized = serialize(node);
		
		System.out.println(serialized);
		
		node = Deserialize(serialized);

		System.out.println(node.left.left.value);

	}

}

class Node{
	String value;
	Node left;
	Node right;
	
	Node(String value,Node left,Node right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	Node(String value){
		this.value = value;
	}
}
