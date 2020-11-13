
package ejemplo15;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Ejemplo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer =new Scanner(System.in);
      String Str;
      System.out.print("Inserta una cuerda de caracteres\n");
      Str = leer.nextLine();
      System.out.println("la cuerda de caracteres de la 6 al final es :"+ Str.substring(6));
      System.out.println("la cuerda de la posicion 4 al 12 es:" + Str.substring(4,12));
    }
    
}
