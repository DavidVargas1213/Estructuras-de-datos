
package LinearDataStructures;

public class test {
	public static void main(String[] args) {
		List lista= new List(); 
		ExampleNode a= new ExampleNode(5);
		ExampleNode b= new ExampleNode(10);
		ExampleNode c= new ExampleNode(7);
		ExampleNode d= new ExampleNode(3);
		
		lista.insertAtBegin(a);
		lista.insertAtBegin(b);
		lista.insertAtBegin(c);
		lista.insertAtBegin(d);
		
		lista.printList();
	}

}
