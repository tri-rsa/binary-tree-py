/*
Se van a tomar 2 valores enteros, 2 valores dobles de tipo String
En un renglon se imprimen 1 valor entero,1 valor double,1 valor de tipo String
en otro renglon lo mismo, se imprime en forma de columna
23      2345.34 Luis Sanchez
 */
package ejemplo12;

import java.util.Scanner;

public class Ejemplo12 {

    public static void main(String[] args) {
        int n1,n2;
        double num1,num2;
        String nom,nom2;
        Scanner leer=new Scanner(System.in);
        System.out.print("Dame un valor entero:");
        n1=leer.nextInt();
        System.out.print("Dame un valor entero:");
        n2=leer.nextInt();
        System.out.print("Dame un valor double:");
        num1=leer.nextDouble();
        System.out.print("Dame un valor double:");
        num2=leer.nextDouble();
        nom=leer.nextLine();
        System.out.print("inserte tu nombre");
        nom=leer.nextLine();
         System.out.print("Inserte otro nombre");
        nom2=leer.nextLine();
        
        System.out.printf("%-6d\t%-7.2f\t%20s\n",n1,num1,nom);
        System.out.printf("%-6d\t%-7.2f\t%20s\n",n2,num2,nom2);
    }
    
}
