package LinearDS_Problems;

import java.io.*;

import LinearDataStructures.Node;
import LinearDataStructures.Queue;

/*
# Contest Problem: ThrowingCardsAway
# https://www.urionlinejudge.com.br/judge/en/problems/view/1110
#
# Created by Msc. Carlos Andres Sierra on April 2018.
# Copyright (c) 2018  Msc. Carlos Andres Sierra. Research Group on Artificial Life - ALIFE. All rights reserved.
#
# This file is part of DataStructuresTemplates.
#
# DataStructuresTemplates is free software: you can redistribute it and/or modify it under the terms of the
# GNU General Public License as published by the Free Software Foundation, version 3.
*/

/**
 * This class represents the solution of Contest Problem: ThrowingCardsAway
 * @author MSc. Carlos Andres Sierra, PhD. student
 */
public class ThrowingCardsAway {

	/**
	 * 
	 */
	public class Coctel implements Node
	{
		public int value;
		public Coctel next = null;
		
		
		/**
		 * 
		 * @param value
		 */
		public Coctel(int value) 
		{
			this.value = value;
		}
		
		@Override
		public void setNext(Node node) 
		{
			this.next = (Coctel)node;
		}


		@Override
		public Node getNext() 
		{
			return next;
		}


		@Override
		public Node clone() {
			Coctel temp = new Coctel(this.value);
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
	
	
	/**
	 * 
	 */
	public ThrowingCardsAway() {}
	
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	public String solution(int number) 
	{
		Queue queue = new Queue();
		Queue removed = new Queue();
		String response = "";
		
		for(int i = 1; i <= number; i++)
			queue.enqueue(new Coctel(i));

		for(int i = 0; i < number - 1; i++)
		{
			removed.enqueue( queue.dequeue() );
			queue.enqueue( queue.dequeue() );
		}
		
		response = "Discarded cards:";
		while(!removed.isEmpty())
			response += removed.dequeue().toString() + ",";
		
		response = response.substring(0, response.length() - 1);
		response += "\nRemaining card: " + queue.dequeue().toString() + "\n";
		
		return response;
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		int number = 0;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		ThrowingCardsAway problem = new ThrowingCardsAway();
		
		try 
		{
			number = Integer.parseInt( br.readLine() );
			
			while(number != 0)
			{
				bw.write( problem.solution(number) );
				number = Integer.parseInt( br.readLine() );
			}
			
			bw.flush();
		}
		catch(Exception ex) {}
	}
}