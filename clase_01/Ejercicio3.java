package clase_01;

// En este ejercicio, multiplicamos dos matrices (matrizA y matrizB) y almacenamos el resultado en la matriz resultado. 
// Usamos bucles anidados para realizar la multiplicación de matrices siguiendo las reglas matriciales. 
// Luego, mostramos la matriz resultado.

public class Ejercicio3 {
    public static void main(String[] args) {
        int[][] matrizA = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrizB = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Imprimir la matriz resultado
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
