import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Tarea {
	
	static int FactorialREC(int n) {
		int rec;
			if(n==0){
				rec=1;
			} else{
				rec=n*FactorialREC(n-1);	
			}
		return rec;
	}

	public static void main (String[] args){
		//BufferedReader leer_Teclado = new BufferedReader(new InputStreamReader(System.in));
		Scanner leer = new Scanner(System.in);
		int dato=0;
		int f=0;
		System.out.print(" \t\t\tIngrese un número: ");
		//d=leer_Teclado.readLine();
		dato=leer.nextInt();
		f=FactorialREC(dato);
		System.out.println("\t\t\t\t"+"El número ingresado fue: "+dato);
		System.out.println("\t\t\t\t"+"El factorial de ese número es: "+f);
	}
	
}