
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
        int edadMinima = 16;  // Edad mínima para entrar
        int precioEntrada = 10000;   // Precio del boleto
        Scanner scanner = new Scanner(System.in);
        Sala sala = new Sala();  // Crear la instancia de la sala
        Entrada entrada = new Entrada(precioEntrada);

        Persona persona = new Persona(); 

        // Validar si el cliente cumple con la edad mínima
        if (!persona.esMayorDeEdad(edadMinima)) {
            return;  // Si el cliente no cumple con la edad, termina el programa
        }

        // Bucle para seguir comprando boletos
        boolean seguirComprando = true;
        while (seguirComprando) {
            entrada.comprar(sala);  // Realiza la compra del boleto

            // Preguntar si desea seguir comprando boletos
            System.out.print("¿Deseas comprar otro boleto? (si/no): ");
            scanner.nextLine();  // Consumir la nueva línea después de `nextInt()`
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

        
        
    

