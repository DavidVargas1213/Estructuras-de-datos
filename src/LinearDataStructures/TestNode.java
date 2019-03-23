package LinearDataStructures;
import LinearDataStructures.*;

public class TestNode {
	public static void main(String[] args) {
		List lista=new List();
		ExampleNode node1=new ExampleNode(3);
		ExampleNode node2=new ExampleNode(4);
		ExampleNode node3=new ExampleNode(6);
		ExampleNode node4=new ExampleNode(7);
		ExampleNode node5=new ExampleNode(2);
		ExampleNode node6=new ExampleNode(0);
		ExampleNode node7=new ExampleNode(14);
		
		
		
		lista.insertAtBegin(node1);
		lista.insertAtBegin(node2);
		lista.insertAtBegin(node3);
		lista.insertAtBegin(node4);
		lista.insertAtBegin(node5);
		lista.insertAtBegin(node6);
		lista.insertAtEnd(node7);
		
		lista.printList();
	}

}
