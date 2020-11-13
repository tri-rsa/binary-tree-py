
import java.util.Scanner;

public class Palindromo {

    public static Scanner sc = new Scanner(System.in);

    static boolean esPalindromo = true;

    public static void main(String[] args) {

        String palabra;
        
        System.out.print("Ingrese la palabra: ");
        palabra = sc.nextLine();
        
        char[] palabraVolteada = new char[palabra.length()];;

        int i = 0;
        int j = palabra.length();

        Voltear_Palabra(palabra, palabraVolteada, i, j);
        Verificar_Palindromo(palabra, palabraVolteada);
        System.out.println("--------------------------------");
        System.out.println("Palabra ingresada: " + palabra);
        System.out.print("Palabra al reves:  ");
        Imprimir_Vector(palabraVolteada);
        
        if (esPalindromo) {
            System.out.println("\n**Es palindromo**");
        } else {
            System.out.println("\n**No es palindromo**");
        }
    }

    public static void Voltear_Palabra(String palabra, char[] palabraVolteada, int i, int j) {

        if (j > 0) {
            palabraVolteada[i] = palabra.charAt(j - 1);
            j--;
            i++;

            Voltear_Palabra(palabra, palabraVolteada, i, j);
        }
    }

    public static void Verificar_Palindromo(String palabra, char[] palabraVolteada) {

        for (int k = 0; k < palabraVolteada.length && esPalindromo; k++) {
            if (palabraVolteada[k] != palabra.charAt(k)) {
                esPalindromo = false;
            }
        }

    }
    
    public static void Imprimir_Vector(char[] palabraVolteada){
            for (int i = 0; i < palabraVolteada.length; i++) {
                System.out.print(palabraVolteada[i]);
            }            
    }
}
