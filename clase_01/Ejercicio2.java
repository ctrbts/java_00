package clase_01;

import java.util.Scanner;

// En este ejercicio pedimos al usuario que ingrese un número entero N. 
// Luego utilizamos un bucle for para sumar los primeros N números naturales y mostramos el resultado.

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner num_scan = new Scanner(System.in);       
        System.out.print("Ingresa un número entero N: ");
        int n = num_scan.nextInt();
        num_scan.close();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
    }
}