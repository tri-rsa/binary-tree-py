import java.util.Scanner;
public class AdivinaNumeroMientras {

    public static void main(String[] args) {
        Scanner kw = new Scanner(System.in);
        int num, contador, numSolicitado;
        double numAleatorio = Math.random();  
        int numA = (int)(numAleatorio*1000)+1;
        contador = 0;
        System.out.println("Intenta adivinar el numero del 1 al 1000");
        while(contador<10){
            contador = contador + 1;
            numSolicitado = kw.nextInt();
            if(numSolicitado==numA){
                System.out.println("Respuesta correcta!!!!");
                contador = 20;
            }
            if (numSolicitado<numA){
                System.out.println("El numero correcto es mayor");
                System.out.println("Intente con otro numero");
            }
            if (numSolicitado>numA){
                System.out.println("El numero correcto es menor");
                System.out.println("Intente con otro numero");
            }
        }
        if(contador == 10){
           System.out.println("Lo siento, no has podido adivinarlo");     
        }
    }
}
