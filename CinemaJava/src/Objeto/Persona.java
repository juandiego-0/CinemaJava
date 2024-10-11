
package Objeto;

import java.util.Scanner;


public class Persona {
   
    private String nombre;
    private int edad;
    
    public Persona() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        this.nombre = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        this.edad = scanner.nextInt();
    }

    public boolean esMayorDeEdad(int edadMinima) {
        if (edad >= edadMinima) {
            System.out.println("Puedes pasar a ver la función.");
            return true;
        } else {
            System.out.println("Lo siento, debes tener " + edadMinima + " o más años.");
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

    

