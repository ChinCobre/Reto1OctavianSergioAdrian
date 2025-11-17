package Reto;

import java.util.Scanner;

public class Funciones3 {
public static  int multiplicar(int a, int b) {
	return a*b;
	
}
	
public static int dividir(int a, int b) {
	Scanner sc = new Scanner(System.in);
	if (a>0 || b >0) {
		return a/b;
	}else {
		return 0;
	}
	
	}
public static boolean esPositivo(int n) {
	if (n>=0) {
		return true;
	}else {
		return false;
	}
}
public static boolean esNegativo(int n) {
	if (n<0) {
		return true;
	}else {
		return false;
	}
}

}
