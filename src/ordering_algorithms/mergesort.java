package ordering_algorithms;

public class mergesort {

	public static int [] mergeSort(int[]a) {
		int size=a.length;
		if(size>1) {
			int size_par=size/2;
			int []a_1=new int [size_par];
			int []a_2=new int [size-size_par];
			for (int i = 0; i <size_par; i++) 
				a_1[i]=a[i];
			for (int i = size_par; i <a_2.length; i++) 
				a_2[i-size_par]=a[i];
			a_1=mergeSort(a_1);
			a_2=mergeSort(a_2);
			a=merge(a_1,a_2);
		}
		return a;
	}
	public static int []merge(int []a_1,int[]a_2){
		int []resp=new int [a_1.length+a_2.length];
		int index_a1=0, index_a2=0, index=0;
		while(index_a1<a_1.length&&index_a2<a_2.length) {
			if(a_1[index_a1]<a_2[index_a2]) {
				resp[index]=a_1[index_a1];
				index+=1;
				index_a1+=1; 
			}else {
				resp[index]=a_2[index_a2];
				index+=1;
				index_a2+=1;
			}
		}
		if(index_a1<a_1.length) {
			for (int i = index_a1;i<a_1.length; i++) {
				resp[index]=a_1[i];
				index+=1;
			}
		}else {
			for (int i = index_a2;i<a_2.length; i++) {
				resp[index]=a_2[i];
				index+=1;
			}
		}return resp; 
	}
	public static void main(String[] args) {
		long Tini, Tfin, time;
		Tini=System.currentTimeMillis();
		Tfin=System.currentTimeMillis();
		time=Tfin-Tini; 
		System.out.println("Time of ejecutation is "+ time);
		int a[]=new int [100];
		for (int i = 0; i < a.length; i++) {
			a[i]= (int) (Math.random()*100);
			System.out.print("Array 100 elements random");
			System.out.print(a[i]);
		}
		mergeSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print("array ordenado");
			System.out.print(a[i]+",");
		}
	}
}

