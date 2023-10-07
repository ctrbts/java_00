package clase_01;

import java.util.Random;

// En este ejercicio, generamos un número aleatorio entre 1 y 100 usando la clase Random. 
// Luego, usamos el operador % para verificar si el número es par o impar. 
// Si el residuo de dividir el número por 2 es igual a 0, es par; de lo contrario, es impar.

public class Ejercicio1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; // Genera un número entre 1 y 100
        System.out.println("Número aleatorio: " + numeroAleatorio);

        if (numeroAleatorio % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
