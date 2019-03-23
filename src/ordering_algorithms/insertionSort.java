package ordering_algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class insertionSort {

	public static void insertionSort(int []a) {
		int index, temp; 
		for(int i=1; i<a.length;i++) {
			index=i; 
			temp=a[i];
			while(index>0&&temp<a[index-1]) {
				a[index]=a[index-1];
				index-=1;
			}
			a[index]=temp; 
		}
	}
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bx = new BufferedWriter(new OutputStreamWriter(System.out));
		bx.write("Ingrese la cantidad de datos del arreglo" + 
		"\n");
		bx.flush();
		int cantDat=Integer.parseInt(br.readLine());
		String nombreArchivo="InsercionI10"+".txt";
		String ruta="C:\\Users\\David Vargas\\Desktop\\Ejecuciones algoritmos de ordenamiento\\insercion\\";
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(ruta+nombreArchivo)));


		for (int i = 1; i <= 30; i++)
		{

			int a[]=new int [cantDat];
			for (int j = 0; j < a.length; j++) {
				a[j]= (int) (Math.random()*999);
			}
			long timeStart = System.nanoTime();
			insertionSort(a);
			long timeFinish = System.nanoTime();
			bw.write(String.valueOf(timeFinish-timeStart)+" ");
			System.out.println("Time "+(timeFinish-timeStart)*Math.pow(10, 9));
			//System.out.println(Arrays.toString(a));


		}
		bw.flush();
		bw.close();

	}
}
