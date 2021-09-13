package m1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// fase1
		
		
		String nom="Vanesa";
		String cognom="Rafols";
		String cognom2="Masot";
		
		System.out.println(cognom+" "+cognom2+", "+nom);
		
		int dia=26;
		int mes=7;
		int any=1972;
		
		System.out.println(dia+"/"+mes+"/"+any);
		
		
		//fase2
		ArrayList<Integer>anys=new ArrayList<Integer>();
		final int anyInicial=1948;
		int resultat=0;
		for (int i=1948; i<=1972;i++) {
			resultat=i;	
			if(resultat%400==0 || resultat%4==0 && resultat%100!=0) {	
				System.out.println("Els anys de traspàs entre 1948 i 1972 són: "+resultat);
				anys.add(resultat);
				System.out.println("Nombre d'anys de traspàs des de 1948 fins 1987:"+anys.size());
			}
		}
		
		//fase3
		
		boolean traspas=false;
			if(any==resultat) {
			traspas=true;
			System.out.println("L'any "+any+ " es de traspàs");
		}else {
			traspas=false;
			System.out.println("L'any "+ any+" no és un any de traspàs");
		}
		
		//fase4
			String cadena="Vanesa " + "Ràfols "+ "Masot ";
			System.out.println("El meu nom és " + cadena);
			String naixement="26"+"/"+"07"+"/"+"1972";
			System.out.println("Vaig néixer el " + naixement);
			if (any==resultat) {
				 traspas=true;
					System.out.println("L'any "+ any + " és de traspàs");
				}else {
				System.out.println("L'any "+ any + " no és de traspàs");
			}
			
			//Nivell 2
			
			double decimals=10.2457;
			int a=25;
			float b=33;
			String comparar="Casting";
			a=(int)decimals;
			System.out.println(a);
			b=(float)decimals;
			System.out.println(b);
			comparar=""+decimals;
			System.out.println(comparar);
			
			//Nivell 3

			int[]array={1,2,3,4,5,6,7,8,9,10};
			for(int k=0;k<array.length;k++) {
				System.out.print(array[k]+" ");
			}
			
			int ultima=array[9];
			for(int j=array.length-2;j>=0;j--) {
			array [j+1]=array[j];
			System.out.print(array[j]+" ");
			
			}
			array[0]=ultima;
			for(int k=0;k<array.length;k++) {
				System.out.print(array[k]+" ");
			}
			
			
			
	}
}

