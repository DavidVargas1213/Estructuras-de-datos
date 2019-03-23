package Poli_ED_Work1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Market {
	public static void main(String[] args) throws IOException {
		File archivo = new File ("C:\\Users\\David Vargas\\Desktop\\Name Products.txt");
		FileReader fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);

		superMarket [] Productos = new superMarket [23];


		for (int i = 0; i < Productos.length; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s," ");
			Productos[i]= new superMarket(st.nextToken(),Double.parseDouble(st.nextToken()));
		}



		superMarket [] Lista = new superMarket [5];
		br.readLine();
		for (int i = 0; i < Lista.length; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s," ");
			Lista[i]= new superMarket(st.nextToken(),Double.parseDouble(st.nextToken()));
		}


		for (int i = 0; i < Lista.length; i++) 
			for (int j = 0; j < Productos.length; j++) 
				if(Lista[i].equals(Productos[j])) 
					Lista[i].setBuy(true);

		double presupuesto=0;
		System.out.println("Se puede comprar:");
		for (int i = 0; i < Lista.length; i++) 
			if(Lista[i].isBuy())
				{
				System.out.println(Lista[i].getNameProduct());
				presupuesto+=Lista[i].getPrice();
				}
		System.out.println("El presupuesto es:"); 
		System.out.println(presupuesto);
	
	}


}
