package Poli_ED_Work1;

import java.io.*;
import java.util.StringTokenizer;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import LinearDataStructures.List;
import LinearDataStructures.Node;


public class Coctel{
	class nodeCoctel implements Node{
		
		public String nameProduct;
		public nodeCoctel next = null;
		
		/**
		 * 
		 * @param value
		 */
		public nodeCoctel (String nameProduct) 
		{
			this.nameProduct =nameProduct;
		}
		
		@Override
		public void setNext(Node node) 
		{
			this.next = (nodeCoctel)node;
		}


		@Override
		public Node getNext() 
		{
			return this.next;
		}


		@Override
		public Node clone() {
			return new nodeCoctel(nameProduct);
		}


		@Override
		public boolean isEqual(Node node) 
		{
			return false;
		}


		@Override
		public boolean isLessThan(Node node) 
		{
			return false;
		}
		
		public String toString()
		{
			return " " + this.nameProduct;
		}

		@Override
		public String getDato() {
			
			return this.nameProduct;
		}
	}
		
	public static int createCoctel() throws IOException { 
		Coctel c = new Coctel();
		List ingredients = new List(); 
		List pasos =new List(); 
		BufferedReader br=new BufferedReader(new FileReader(new File("C:/Users/David Vargas/Desktop/ingredients.txt")));
		BufferedReader cr=new BufferedReader(new FileReader(new File("C:/Users/David Vargas/Desktop/pasos.txt")));
		String x=cr.readLine();
		String s=br.readLine();
		int presupuesto=0;
		while (!s.equals(" "))
		{
			ingredients.insertAtBegin(c.new nodeCoctel(s));
			s=br.readLine();
			
		}
		while(!x.equals(" "))
		{
			pasos.insertAtBegin(c.new nodeCoctel(x));
			x=cr.readLine();
			
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				ingredients.printList();
				System.out.println(ingredients.get(j));
				StringTokenizer st = new StringTokenizer(s," ");
				st.nextToken();
				if((pasos.get(i).getDato().contains(st.nextToken()))){
					ingredients.deleteAtIndex(j);
					String p=st.nextToken();
					presupuesto+=Integer.parseInt(p);
				}
				
			}
			
			
		}
		return presupuesto;
	}
	public static void main(String[] args) throws IOException {
		System.out.println(createCoctel());
	}
	

	
	
	
	
	
}
