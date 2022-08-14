package boulot;

import java.util.Scanner;

public class App {

		public static int decimalBinaire(int n) {
			if(n==0) {
				return 0;	
			}
			return n%2 + 10*decimalBinaire(n/2);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		System.out.println("saisir un nombre: "); 	
		int a=sc.nextInt();
		System.out.println(+a+" en binaire donne: "+decimalBinaire(a));
		}
}
