package Poli_ED_Work1;

import LinearDataStructures.Node;


public class ProblemNode implements Node
{
	public String value;
	public ProblemNode next = null;
	
	
	/**
	 * 
	 * @param value
	 */
	public ProblemNode(String value) 
	{
		this.value =value;
	}
	
	@Override
	public void setNext(Node node) 
	{
		this.next = (ProblemNode)node;
	}


	@Override
	public Node getNext() 
	{
		return next;
	}


	@Override
	public Node clone() {
		ProblemNode temp = new ProblemNode(this.value);
		return temp;
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
		return " " + this.value;
	}
}
