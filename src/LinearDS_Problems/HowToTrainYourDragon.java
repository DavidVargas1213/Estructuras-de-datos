package LinearDS_Problems;
//https://www.urionlinejudge.com.br/judge/en/problems/view/1851

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.sun.imageio.plugins.common.InputStreamAdapter;

import LinearDataStructures.List;
import LinearDataStructures.Node;

public class HowToTrainYourDragon implements Node {
	
	public int days;
	public int mult; 
	public HowToTrainYourDragon next= null; 
	
	
	public HowToTrainYourDragon(int days, int mult) {
		this.days=days;
		this.mult=mult;
		
	}
	
	@Override
	public void setNext(Node node) {
		
		this.next=(HowToTrainYourDragon)node;
		
	}

	@Override
	public Node getNext() {
		
		return this.next;
	}

	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		return new HowToTrainYourDragon(days, mult);
	}

	@Override
	public boolean isEqual(Node node) {
		HowToTrainYourDragon temp = (HowToTrainYourDragon)node;
		return (this.days==( temp.days)&&(this.mult==(temp.mult))) ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		
		return false;
	}

	@Override
	public String getDato() {
		// TODO Auto-generated method stub
		return null;
	}	
		public int solution() {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		
		List days = new List();
		List mult = new List(); 
		
		
		
		
		
	}
	

	



}