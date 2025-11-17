package Reto;

import java.util.Scanner;
import Reto.Funciones1;
import Reto.Funciones2;
import Reto.Funciones3;
public class Reto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int entrada=0;
		
		do {
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicarr");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. salir");
			String menu = sc.nextLine();
			entrada= Integer.parseInt(menu);
			
			
			switch (entrada) {
			case 1:
				System.out.println("Dame un numero");
				int n1=Integer.parseInt(sc.nextLine());
				System.out.println("Dame otro numero");
				int n2=Integer.parseInt(sc.nextLine());
				System.out.println(Funciones2.suma(n1, n2));
				break;
			case 2:
				System.out.println("Dame un numero");
				n1=Integer.parseInt(sc.nextLine());
				System.out.println("Dame otro numero");
				n2=Integer.parseInt(sc.nextLine());
				System.out.println(Funciones2.resta(n1, n2));
				break;
			case 3:
				System.out.println("Dame un numero");
				n1=Integer.parseInt(sc.nextLine());
				System.out.println("Dame otro numero");
				n2=Integer.parseInt(sc.nextLine());
				System.out.println(Funciones3.multiplicar(n1, n2));
				break;
			case 4:
				System.out.println("Dame un numero");
				n1=Integer.parseInt(sc.nextLine());
				System.out.println("Dame otro numero");
				n2=Integer.parseInt(sc.nextLine());
				System.out.println(Funciones3.dividir(n1, n2));
				break;
			case 5:
				System.out.println("Dame un numero");
				n1=Integer.parseInt(sc.nextLine());
				System.out.println(Funciones2.esPar(n1));
				break;
			case 6:
				System.out.println("Dame un numero");
				n1=Integer.parseInt(sc.nextLine());
				System.out.println(Funciones2.esImpar(n1));
				break;
			case 7:
				System.out.println("Dame un numero");
				n1=Integer.parseInt(sc.nextLine());
				System.out.println(Funciones3.esPositivo(n1));
				break;
			case 8:
				System.out.println("Dame un numero");
				n1=Integer.parseInt(sc.nextLine());
				System.out.println(Funciones3.esNegativo(n1));
				break;
			case 0:
				break;

			default:
				break;
			}
			} while (entrada!=0);
		
		
		
		
		
		
	}

	

	
	
}
