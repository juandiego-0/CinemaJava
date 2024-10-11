
package cinemajava;

import Objeto.Entrada;
import Objeto.Info;
import Objeto.Persona;
import Objeto.Sala;
import java.util.Scanner;

public class CinemaJava {

   
    public static void main(String[] args) {
         {
             
        Info info = new Info();
        info.mostrar();
        int edadMinima = 16;  
        int precioEntrada = 10000;   
        Scanner scanner = new Scanner(System.in);
        Sala sala = new Sala();  
        Entrada entrada = new Entrada(precioEntrada);

        Persona persona = new Persona(); 

        
        if (!persona.esMayorDeEdad(edadMinima)) {
            return;  
        }

        
        boolean seguirComprando = true;
        while (seguirComprando) {
            entrada.comprar(sala);

            
            System.out.print("¿Deseas comprar otro boleto? (si/no): ");
            scanner.nextLine();  
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("no")) {
                seguirComprando = false;
                System.out.println("Gracias por tu compra.");
            }
        }

        scanner.close(); 
    }
}

}

        
        
    

