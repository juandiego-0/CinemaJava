
package Objeto;

import java.util.Scanner;


public class Entrada {
    
    private int precio;
    
    public Entrada (int precio) {
        this.precio = precio;
    }

    public void comprar(Sala sala) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("El boleto de entrada cuesta " + precio + "\nIngrese el dinero: ");
        int dinero = scanner.nextInt();

        if (dinero < precio) {
            System.out.println("Dinero insuficiente, te falta: " + (precio - dinero));
            return;
        } else if (dinero == precio) {
            System.out.println("Compra realizada con éxito. ¡Gracias por tu compra!");
        } else {
            int sobra = dinero - precio;
            System.out.println("Compra realizada con éxito. Te sobran: " + sobra);
        }

        sala.imprimir();

        
        String asientoAleatorio = sala.aleatorio();
        sala.marcarAsientoOcupado(asientoAleatorio);
        System.out.println("Tu asiento asignado es: " + asientoAleatorio);
    }
}

    

