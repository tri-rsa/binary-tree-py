
import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa la longitud de la Serie Fibonacci:");
        int numero = Integer.parseInt(scan.next());
        
        for(int i = 0; i < numero; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }  
    public static int fibonacci(int numero){
        if (numero == 0) {
            return 0;
        }
        if (numero == 1 || numero == 2) {
            return 1;
        }
        else {
            return fibonacci(numero-1)+fibonacci(numero-2);
        }
    }
}
    
    

