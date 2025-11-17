package Reto;

import java.util.Scanner;

public class Funciones3 {
/* Devuelve la multiplicación de dos números enteros */
	public static  int multiplicar(int a, int b) {
	return a*b;
	
}
	
/* Devuelve la division de dos números siempre y cuando sea ambos numeros sean mayor de 0 si no devuelve 0*/
	public static int dividir(int a, int b) {
	if (a>0 && b >0) {
		return a/b;
	}else {
		return 0;
	}
	
	}
/* Indica si el numero es positivo(true) o no(False)*/
	public static boolean esPositivo(int n) {
	if (n>=0) {
		return true;
	}else {
		return false;
	}
}
/* Indica si el numero es negativo(True) o no (False)*/
	public static boolean esNegativo(int n) {
	if (n<0) {
		return true;
	}else {
		return false;
	}
}

}
