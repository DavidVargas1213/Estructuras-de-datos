package ordering_algorithms;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bubbleSort {

	public static void bubblesort (int []a) {

		int temp;
		boolean swapped=false; 
		do {
			swapped=false; 
			for (int i = 0; i < a.length-1; i++) {
				if(a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					swapped=true;
				}
			}
		}while(swapped);


	}



	public static void main(String[] args) throws IOException  {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Cantidad de datos a ordenar?");
		int cantDat=Integer.parseInt(br.readLine());
		String nombreArchivo="burbujaD10I500"+".txt";
		String ruta="C:\\Users\\David Vargas\\Desktop\\Ejecuciones algoritmos de ordenamiento\\burbuja\\";
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(ruta+nombreArchivo)));


		for (int i = 1; i <= 30; i++)
		{

			int a[]=new int [cantDat];
			for (int j = 0; j < a.length; j++) {
				a[j]= (int) (Math.random()*999);
			}

			long timeStart = System.currentTimeMillis();
			bubblesort(a);
			long timeFinish = System.currentTimeMillis();

			bw.write(String.valueOf(timeFinish-timeStart)+" ");
			System.out.println("Time in miliseconds "+(timeFinish-timeStart));
			//System.out.println(Arrays.toString(a));


		}
		bw.flush();
		bw.close();

	}
}
















